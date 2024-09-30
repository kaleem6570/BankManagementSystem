
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class Fastcash extends JFrame implements ActionListener{
    JButton  hundred,twohundred,Fivehundred,Thousand,FiveThousand,TenThousand,back;
    String pinnumber;
Fastcash(String pinnumber){
    this.pinnumber = pinnumber;
    setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    
    JLabel text = new JLabel("SELECT WITHDRAWL");
    text.setBounds(250,300,700,35);
    text.setForeground(Color.WHITE);
    text.setFont(new Font("System", Font.BOLD,16));
    image.add(text);
    
    hundred = new JButton("Rs 100");
    hundred.setBounds(160,415,150,30);
    hundred.addActionListener(this);
    image.add(hundred);
    
    twohundred = new JButton("Rs 200");
    twohundred.setBounds(360,415,150,30);
    twohundred.addActionListener(this);
    image.add(twohundred);
    
    Fivehundred = new JButton("Rs 500");
Fivehundred.setBounds(160,450,150,30);
   Fivehundred.addActionListener(this);
    image.add(Fivehundred);
    
    Thousand = new JButton("Rs 1000");
    Thousand.setBounds(360,450,150,30);
    Thousand.addActionListener(this);
    image.add(Thousand);
    
    FiveThousand = new JButton("Rs 5000");
    FiveThousand.setBounds(160,485,150,30);
   FiveThousand.addActionListener(this);
    image.add(FiveThousand);
    
   TenThousand = new JButton("Rs 10000");
    TenThousand.setBounds(360,485,150,30);
    TenThousand.addActionListener(this);
    image.add(TenThousand);
    
     back = new JButton("Back");
    back.setBounds(160,520,150,30);
    back.addActionListener(this);
    image.add(back);
    
    
    
    
    setSize(900,900);
    setLocation(300,0);
    setVisible(true);
    
    
}
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== back){
             setVisible(false);
             new Transaction(pinnumber).setVisible(true);
         }
         else{
             String amount = ((JButton)ae.getSource()).getText().substring(3);
             Conn c = new Conn();
             try{
                 ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                 int balance = 0;
                 while(rs.next()){
                     if(rs.getString("type").equals("Deposit")){
                         balance += Integer.parseInt(rs.getString("amount"));
                     }
                     else{
                         balance-= Integer.parseInt(rs.getString("amount"));
                     }
                 }
                   if(ae.getSource()!=back&&balance<Integer.parseInt(amount)){
                 JOptionPane.showMessageDialog(null,"Insufficient Balance");
                 return;
             }
               Date date = new Date();
               String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs" + amount + "Debited Sucessfully");
               new Transaction(pinnumber).setVisible(true);
             }
           
             catch(Exception e){
                 System.out.println(e);
             }
         }
         
    }
    public static void main(String args[]) {
        new Fastcash("");
    }
}
