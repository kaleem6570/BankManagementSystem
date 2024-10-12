package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
  long random;
  JTextField nameTextField, fnameTextField,AddressTextField, emailTextField,cityTextField,stateTextField,pincodeTextField;
  JButton next;
  JRadioButton male, female,married,single;
  JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
         random = Math.abs((ran.nextLong()%9000L)+1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Arial",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
        JLabel personalDetails = new JLabel("page 1: Personal Details");
        personalDetails.setFont(new Font("Arial",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raieway", Font.BOLD,20));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father Name: ");
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,20));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
        JLabel Dob = new JLabel("Date of Birth: ");
        Dob.setFont(new Font("Arial",Font.BOLD,20));
        Dob.setBounds(100,240,200,30);
        add(Dob);
         dateChooser= new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial",Font.BOLD,20));
        gender.setBounds(100,290,100,30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.decode("#ADD8E6"));
        add(male);
        
          female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.decode("#ADD8E6"));
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD,20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Arial",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.decode("#ADD8E6"));
        add(married);
        
          single = new JRadioButton("Single");
        single.setBounds(450,390,100,30);
        single.setBackground(Color.decode("#ADD8E6"));
        add(single);
        
        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(married);
        statusgroup.add(single);
        
        JLabel  address = new JLabel("Address: ");
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setBounds(100,440,100,30);
        add(address);
        
         AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway", Font.BOLD,20));
        AddressTextField.setBounds(300,440,400,30);
        add(AddressTextField);
        
        
        JLabel  state = new JLabel("state: ");
        state.setFont(new Font("Arial",Font.BOLD,20));
        state.setBounds(100,490,100,30);
        add(state);
        
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,20));
        stateTextField.setBounds(300,490,400,30);
        add(stateTextField);
         
        JLabel  city = new JLabel("City:");
        city.setFont(new Font("Arial",Font.BOLD,20));
        city.setBounds(100,540,100,30);
        add(city);
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raieway", Font.BOLD,20));
        cityTextField.setBounds(300,540,400,30);
        add(cityTextField);
        
        
       JLabel  pincode = new JLabel("PinCode: ");
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        pincode.setBounds(100,590,100,30);
        add(pincode);
        
         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD,20));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
     
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,650,80,30);
        next.addActionListener(this);
        add(next);
        
    
  
        getContentPane().setBackground(Color.decode("#ADD8E6"));
        
        setSize(850, 800);
        setLocation(350,10);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        String formno = ""+random; // long
        String name = nameTextField.getText();//set text
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
       String marital = null;
       if(married.isSelected()){
           marital = "married";
       }
       else if(single.isSelected()){
           marital = "single";
       }
       String address = AddressTextField.getText();
       String city = cityTextField.getText();
       String state = stateTextField.getText();
       String pincode = pincodeTextField.getText();
       
       try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null,"Name is required");
           }
            if(fname.equals("")){
               JOptionPane.showMessageDialog(null,"Father Name is required");
           }
             if(dob.equals("")){
               JOptionPane.showMessageDialog(null,"Date of Birth is required");
           }
            if(!male.isSelected()&&!female.isSelected()){
               JOptionPane.showMessageDialog(null,"Gender Specification is required");
           } 
               if(email.equals("")){
               JOptionPane.showMessageDialog(null,"Email is required");
           }
               if(!married.isSelected()&&!single.isSelected()){
               JOptionPane.showMessageDialog(null,"Marital Status is required");
           }
               if(address.equals("")){
               JOptionPane.showMessageDialog(null,"Address is required");
           }
               if(state.equals("")){
               JOptionPane.showMessageDialog(null,"State is required");
           }
               if(city.equals("")){
               JOptionPane.showMessageDialog(null,"City is required");
           }
              if(pincode.equals("")) {
               JOptionPane.showMessageDialog(null,"Pincode is required");
           }
               
               
              else {
               Conn c = new Conn();
               String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
              c.s.executeUpdate(query);
              setVisible(false);
              new SignupTwo(formno).setVisible(true);
           }
       
       }catch(Exception e){
           
       }
    }
    
    
    public static void main(String args[]) {
      new SignupOne();
    }
}
