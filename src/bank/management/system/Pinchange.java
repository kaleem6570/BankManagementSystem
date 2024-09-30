package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pinchange extends JFrame implements ActionListener{
    JLabel text,pintext,repintext;
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
      Pinchange(String pinnumber){
          this.pinnumber=pinnumber;
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
       Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
       ImageIcon i3 =new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(0,0,900,900);
       add(image);
       
        text = new JLabel("CHANGE YOUR PIN");
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
       text.setBounds(250, 280, 500, 35);
       image.add(text);
       
       pintext = new JLabel("New PIN:");
       pintext.setForeground(Color.WHITE);
       pintext.setFont(new Font("System",Font.BOLD,16));
       pintext.setBounds(160,320,180,25);
       image.add(pintext);
       
       
       pin = new JPasswordField();
       pin.setFont(new Font("Raieway", Font.BOLD, 20));
       pin.setBounds(330, 320, 180, 20);
       image.add(pin);
       
       repintext = new JLabel("Re-Enter New PIN:");
       repintext.setForeground(Color.WHITE);
       repintext.setFont(new Font("System",Font.BOLD,16));
       repintext.setBounds(160,360,180,25);
       image.add(repintext);
       
       repin = new JPasswordField();
       repin.setFont(new Font("Raieway", Font.BOLD, 20));
       repin.setBounds(330, 360, 180, 20);
       image.add(repin);
       
       
        change = new JButton("CHANGE");
       change.setBounds(355, 465, 150, 30);
       change.addActionListener(this);
       image.add(change);
       
       back = new JButton("BACK");
      back.setBounds(355,500,150,30);
      back.addActionListener(this);
      image.add(back);
      
      
       
       setSize(900, 900);
       setLocation(300,0);
       setUndecorated(true);
       setVisible(true);
      }
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
         try{
             String npin = pin.getText();
             String rpin = repin.getText();
             
             if(!npin.equals(rpin)){
                 JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                 return;
             }
              if(npin.equals("")){
             JOptionPane.showMessageDialog(null,"Please Enter PIN");
             return;
         }
               if(rpin.equals("")){
             JOptionPane.showMessageDialog(null,"Please Enter PIN");
             return;
         }
             Conn c = new Conn();
             String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
              String query2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'"; 
              String query3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
              c.s.executeUpdate(query1);
              c.s.executeUpdate(query2);
              c.s.executeUpdate(query3);
              
              JOptionPane.showMessageDialog(null, "PIN Sucessfully Changed");
              
              setVisible(false);
              new Transaction(rpin).setVisible(true);
         }
        
         catch(Exception e){
             System.out.println(e);
         }
        }
        else{
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
      }
      public static void main(String args[]){
          new Pinchange("").setVisible(true);
      }
}
