package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{

  JTextField adhar,pan;
  JButton next;
  JRadioButton yes,No,eyes,eno;
  JComboBox religion,category,Education,Occupation,incomecategory;
  String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
   
        JLabel AdditionalDetails = new JLabel("Page 2: Adiitional Details");
        AdditionalDetails.setFont(new Font("Arial",Font.BOLD,22));
        AdditionalDetails.setBounds(290,80,400,30);
        add(AdditionalDetails);
        
        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"None","Hindu", "Muslim", "Chirstian","others"};
          religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"None","General" ,"OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        JLabel Dob = new JLabel("Income: ");
        Dob.setFont(new Font("Arial",Font.BOLD,20));
        Dob.setBounds(100,240,200,30);
        add(Dob);
        String valincomecategory[] = {"Null" ,"< 1,50,000","< 2,50,000","< 5,00,000","< 10,00,000"};
        incomecategory = new JComboBox(valincomecategory);
        incomecategory.setBounds(300,240,400,30);
        incomecategory.setBackground(Color.WHITE);
        add(incomecategory);
        
        
        
         
        
        JLabel gender = new JLabel("Educational ");
        gender.setFont(new Font("Arial",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        
       
        
        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String Educationvalues[] = {"None","None-Graduate" ,"Graduate","Post-Graduation","Doctrate","Others"};
        Education = new JComboBox(Educationvalues);
        Education.setBounds(300,315,400,30);
        Education.setBackground(Color.WHITE);
        add(Education);
         
        
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Arial",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String Occupationalvalues[] = {"None","Salaried" ,"Self-Employed","Buissness","Student","Others"};
        Occupation = new JComboBox(Occupationalvalues);
        Occupation.setBounds(300,390,400,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
        JLabel  address = new JLabel("PAN Number: ");
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
         pan = new JTextField();
        pan.setFont(new Font("Arial", Font.BOLD,20));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        
        JLabel  state = new JLabel("Adhaar Number: ");
        state.setFont(new Font("Arial",Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);
        
         adhar = new JTextField();
        adhar.setFont(new Font("Arial", Font.BOLD,20));
        adhar.setBounds(300,490,400,30);
        add(adhar);
         
        JLabel  city = new JLabel("Senior Citizen:");
        city.setFont(new Font("Arial",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);
        
        yes = new JRadioButton("Yes");
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.decode("#ADD8E6"));
        add(yes);
        
          No = new JRadioButton("No");
        No.setBounds(450,540,100,30);
        No.setBackground(Color.decode("#ADD8E6"));
        add(No);
        
        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(yes);
        statusgroup.add(No);
       
        
        
       JLabel  pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
       eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.decode("#ADD8E6"));
        add(eyes);
        
          eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.decode("#ADD8E6"));
        add(eno);
        
        ButtonGroup exgroup = new ButtonGroup();
        exgroup.add(eyes);
        exgroup.add(eno);
       
         
     
        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,14));
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
        String sreligion = (String) religion.getSelectedItem();//set text
        String scategory =  (String) category.getSelectedItem();
        String sincome = (String) incomecategory.getSelectedItem();
        String seducation = (String) Education.getSelectedItem();
        String soccupation = (String) Occupation.getSelectedItem();
        String seniorcitizen = null;
        if(yes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(No.isSelected()){
            seniorcitizen="No";
        }
       
       String existingaccount = null;
       if(eyes.isSelected()){
           existingaccount = "Yes";
       }
       else if(eno.isSelected()){
           existingaccount = "No";
       }
       String span = pan.getText();
       String sadhar = adhar.getText();
       
       try{
         if(sreligion.equals("None")){
               JOptionPane.showMessageDialog(null,"Religion is required");
           }
            if(scategory.equals("None")){
               JOptionPane.showMessageDialog(null,"Category is required");
           }
             if(sincome.equals("None")){
               JOptionPane.showMessageDialog(null,"Income is required");
           }
           
               if(seducation.equals("None")){
               JOptionPane.showMessageDialog(null,"Education is required");
           }
             
               if(soccupation.equals("None")){
               JOptionPane.showMessageDialog(null,"Occupation is required");
           }
                if(span.equals("")){
               JOptionPane.showMessageDialog(null,"Pan Number is required");
           }
               if(sadhar.equals("")){
               JOptionPane.showMessageDialog(null,"Adhaar NUMBER is required");
           }
                 if(!yes.isSelected()&&!No.isSelected()){
               JOptionPane.showMessageDialog(null,"Select an option");
           }
                  if(!eyes.isSelected()&&!eno.isSelected()){
               JOptionPane.showMessageDialog(null,"Select an option");
           } 
           
           else{
               Conn c = new Conn();
               String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
              c.s.executeUpdate(query);
              setVisible(false);
              new SignupThree(formno).setVisible(true);
                   }
              
       
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
    public static void main(String args[]) {
      new SignupTwo("");
    }
}
