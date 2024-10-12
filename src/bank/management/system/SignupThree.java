
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
     SignupThree(String formno){
         this.formno=formno;
          setLayout(null);
          JLabel l1 = new JLabel("Page 3: Account Details");
          l1.setFont(new Font("Raleway", Font.BOLD,22));
          l1.setBounds(280, 40, 400, 40);
          add(l1);
          
         JLabel type = new JLabel("Account Type:");
          type.setFont(new Font("Raleway", Font.BOLD,22));
          type.setBounds(100, 140, 400, 30);
          add(type); 
         
        r1 =  new JRadioButton("Saving Account");  
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 180, 150, 21);
        r1.setBackground(Color.decode("#ADD8E6"));
        add(r1);
        
        r2 =  new JRadioButton("Fixed Deposit Account");  
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(350,180,200,21);
        r2.setBackground(Color.decode("#ADD8E6"));
        add(r2);
        
        r3 =  new JRadioButton("Current Account");  
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 220, 155, 21);
        r3.setBackground(Color.decode("#ADD8E6"));
        add(r3);
          
        
        r4 =  new JRadioButton("Recurring Deposit Account");  
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(350,220,240,21);
        r4.setBackground(Color.decode("#ADD8E6"));
        add(r4);
         
        ButtonGroup  groupaccount = new ButtonGroup(); 
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
          JLabel Card = new JLabel("Card Number:");
          Card.setFont(new Font("Raleway", Font.BOLD,22));
          Card.setBounds(100, 270, 200, 30);
          add(Card); 
       
          JLabel number = new JLabel("XXXX-XXXX-XXXX-4134");
          number.setFont(new Font("Raleway", Font.BOLD,22));
          number.setBounds(300, 270, 300, 30);
          add(number);
          JLabel detail = new JLabel("Your 16-digit Card Number");
          detail.setFont(new Font("Raleway", Font.BOLD,12));
          detail.setBounds(100, 300, 300, 20);
          add(detail);
          JLabel pin = new JLabel("PIN:");
          pin.setFont(new Font("Raleway", Font.BOLD,22));
          pin.setBounds(100, 340, 300, 30);
          add(pin);
          JLabel pass = new JLabel("XXXX");
          pass.setFont(new Font("Raleway", Font.BOLD,22));
          pass.setBounds(300, 340, 300, 30);
          add(pass);
          JLabel pdetail = new JLabel("4-digit password");
          pdetail.setFont(new Font("Raleway", Font.BOLD,12));
          pdetail.setBounds(100, 370, 300, 20);
          add(pdetail);
          JLabel service = new JLabel("Service Required:");
          service.setFont(new Font("Raleway", Font.BOLD,22));
          service.setBounds(100, 400, 300, 30);
          add(service);
          
          c1 = new JCheckBox("ATM CARD");
          c1.setBackground(Color.decode("#ADD8E6"));
          c1.setBounds(100, 430, 200, 30);
          add(c1);
          c2 = new JCheckBox("Internet Banking");
          c2.setBackground(Color.decode("#ADD8E6"));
          c2.setBounds(300, 430, 200, 30);
          add(c2);
          c3 = new JCheckBox("Mobile Banking");
          c3.setBackground(Color.decode("#ADD8E6"));
          c3.setBounds(100, 490, 200, 30);
          add(c3);
          c4 = new JCheckBox("SMS Alerts");
          c4.setBackground(Color.decode("#ADD8E6"));
          c4.setBounds(300, 490, 200, 30);
          add(c4);
          c5 = new JCheckBox("Cheque Book");
          c5.setBackground(Color.decode("#ADD8E6"));
          c5.setBounds(100, 550, 200, 30);
          add(c5);
          c6 = new JCheckBox("E-Statement");
          c6.setBackground(Color.decode("#ADD8E6"));
          c6.setBounds(300, 550, 200, 30);
          add(c6);
          c7 = new JCheckBox("I hereby declare that the above entered details i have entered are correct.");
          c7.setBackground(Color.decode("#ADD8E6"));
          c7.setBounds(100, 640, 500, 30);
          add(c7);
          submit = new JButton("Submit");
          submit.setBackground(Color.BLACK);
          submit.setForeground(Color.WHITE);
          submit.setFont(new Font("Raieway", Font.BOLD,14));
          submit.setBounds(220,680,100,30);
          submit.addActionListener(this);
          add(submit);
          cancel = new JButton("Cancel");
          cancel.setBackground(Color.BLACK);
          cancel.setForeground(Color.WHITE);
          cancel.setFont(new Font("Raieway", Font.BOLD,14));
          cancel.setBounds(420,680,100,30);
          cancel.addActionListener(this);
          add(cancel);
          
     
           getContentPane().setBackground(Color.decode("#ADD8E6"));
          setSize(850, 820);
          setLocation(350, 0);
          setVisible(true);
     }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
           String accountType =null;
           if(r1.isSelected()){
               accountType = "Saving Account";
           }
           else if(r2.isSelected()){
               accountType = "Fixed Deposit Account";
           }
             if(r3.isSelected()){
               accountType = "Current Account";
           }
              if(r4.isSelected()){
               accountType = "Recurring Deposit Account";
           }
              Random random = new Random();
              String cardnumber = "" + Math.abs((random.nextLong()%90000000)+5040936000000000L);
              String pinnumber ="" + Math.abs((random.nextLong()%9000L)+1000L);
              String  facility = "";
              if(c1.isSelected()){
                  facility = facility +" ATM Card";
              }
               if(c2.isSelected()){
               facility = facility + " Internet Banking";
           }
                if(c3.isSelected()){
               facility = facility + " Mobile Banking";
           }
                 if(c4.isSelected()){
                facility = facility + " Email or Sms Alerts";
           }
                  if(c5.isSelected()){
               accountType = " Cheque Book";
           }
                   if(c6.isSelected()){
               accountType = " E-Statement";
           }
                
           try{
              if(accountType.equals("")){
                  JOptionPane.showMessageDialog(null, "Account Type is required");
              } 
              else
              {
                  Conn conn = new Conn();
                  
                  String query1 ="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  String query2 ="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                 conn.s.executeUpdate(query1);
                 conn.s.executeUpdate(query2);
                 JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " +pinnumber);
                 
                 
                 setVisible(false);
                 new Deposit(pinnumber).setVisible(true);
              }
              }

              catch (Exception e){
               System.out.println(e);
           } 
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new SignupThree("");
    }
}
