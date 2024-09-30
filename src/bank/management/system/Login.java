package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
   
    JButton login,clear,signup;
     JTextField  cardTextField;
     JPasswordField  pinTextField;
    Login(){
        setTitle("KBank");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome to kaleem's bank");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(250, 40, 900, 90);
        add(text);
        
        JLabel cardno  = new JLabel("CARD NO:");
         cardno.setFont(new Font("Raieway",Font.BOLD,24));
        cardno.setBounds(300,160,400,40);
        add(cardno);
        cardTextField = new JTextField();
        cardTextField.setBounds(450,169,200,23);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin  = new JLabel("PIN:");
        pin.setFont(new Font("Raieway",Font.BOLD,24));
        pin.setBounds(370,200,400,40);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(450,209,200,23);
         pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        
        login = new JButton("SIGN IN");
        login.setBounds(350,250,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(500,250,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
         clear.addActionListener(this);
        add(clear);
        
        
        
        JLabel com = new JLabel("Dont have an account?");
        com.setBounds(410,280,300,30);
        com.setFont(new Font("Osward",Font.BOLD,12));
        add(com);
        signup = new JButton("signup");
        signup.setBounds(380,310,200,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
         signup.addActionListener(this);
        add(signup);
        
        
        
        
        getContentPane().setBackground(Color.decode("#ADD8E6"));
        
        
        setSize(900, 500);
        setVisible(true);
        setLocation(350, 300);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ae.getSource()==login){
           Conn conn = new Conn();
           String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card number or Pin");
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        
    }
    public static void main(String[] args){
        new Login();
    }
}
