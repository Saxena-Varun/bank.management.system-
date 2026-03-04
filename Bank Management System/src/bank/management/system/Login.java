package bank.management.system;
import javax.swing.*;
// Java Swing is used to develop Graphical User Applications (GUI), desktop-based applications. 
import java.awt.*;
//Java AWT (Abstract Window Toolkit) is an API to develop GUI or window-based applications in java 
//IMAGE CLASS ARE PERSENT IN "awt"

import java.awt.event.*;
import java.sql.*;
        
public class Login extends JFrame implements ActionListener{ //USE INHERTANCE & JFrame IS A CLASS OF SWING  
    //ACTIONLISTENER IS A INTERFACE TO ADD ACTION IN THE BUTTONS its override the the class 'LOGIN'
    
    JButton login, signup, clear;
    //define globily to access in another function.
    
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){            //CONSTRUCTOR 
         setTitle("AUTOMATED TELLER MACHINE"); // USE TO SET TITLE 
         setLayout(null);//IT IS USE FOR CUSTOME LAYOUT IN FRAME 
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
         //IT IS CLASS USE ADD IMG IN FRAME 
       
         Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
         //IT IS USE SCALE THE IMAGE.
        
         ImageIcon i3 =new ImageIcon(i2);
         //IT USE TO CONVERT IMAGEICON INTO IMAGE, SO WE CAN CALL IT
       
         JLabel label = new JLabel(i3); 
         // JLabel is use for to display a short string or an image icon.
        
         label.setBounds(70, 10, 100, 100);
         //USE TO CHANGE THE LOCATION OF THE IMAGE ON THE FRAME// CHANGE THE LOCATION OF THE LABEL
        
         add(label); // IT IS USE PLACE ANY COMPONENT ON FRAME.
        
         JLabel text = new JLabel("WELCOME TO ATM");
         //JLABEL IS USE FOR TO WRITE ON THE FRAME.
        
         text.setFont(new Font("Osward",Font.BOLD,38));
         //TO SET FONT ON THE TEXT.
       
         text.setBounds(200,40,400,40);
         //SETBOUNDS USE FOR LOCATION.
       
         add(text);
         //PLACE TEXT ON THE FRAME.
        
         JLabel cardno = new JLabel("Card No:");
         cardno.setFont(new Font("Raleway",Font.BOLD,28));
         cardno.setBounds(120,150,150,30);
         add(cardno);
        
         cardTextField = new JTextField();
         // use to add field in frame to entry the details 
       
         cardTextField.setBounds(300,150,230,30);
         cardTextField.setFont(new Font("Arial", Font.BOLD,14));
         add(cardTextField);
        
         JLabel pin = new JLabel("PIN:");
         pin.setFont(new Font("Raleway",Font.BOLD,28));
         pin.setBounds(120,220,230,30);
         add(pin);
        
         pinTextField = new JPasswordField();
         pinTextField.setBounds(300,220,230,30);
         pinTextField.setFont(new Font("Arial", Font.BOLD,14));
         add(pinTextField);
                
         login = new JButton("SIGN IN");  
         //ADD BUTTON IN THE FRAME.
       
         login.setBounds(300,300,100,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         //ActionListener is use to catch the event of the button
         add(login);
       
         clear = new JButton("CLEAR");
         clear.setBounds(430,300,100,30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear);
       
         signup = new JButton("SIGNUP");
         signup.setBounds(300,350,230,30);
         signup.setBackground(Color.BLACK);
         signup.setForeground(Color.WHITE);
         signup.addActionListener(this);
         add(signup);
       
         getContentPane().setBackground(Color.white); //USE FOR BG 
        
        
         setSize(800, 450); //USE FOR FRAME SIZE.
         setVisible(true);   // USE FOR SEE THE FRAME 
         setLocation(350, 200);// USE FOR LOCATION OF FRAME 
         
    }
    
    public void actionPerformed(ActionEvent ae){ //IS AN ABSTRACT METHOD
      if (ae.getSource() == clear){
         cardTextField.setText("");
         pinTextField.setText("");
      } else if (ae.getSource()== login) {
          Conn conn = new Conn();
          String cardnumber = cardTextField.getText();
          String pinnumber = pinTextField.getText();
          String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
          try{
              ResultSet rs = conn.s.executeQuery(query);
              if (rs.next()){
                  setVisible(false);
                  new Transactions(pinnumber).setVisible(true);
              }else {
                  JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
              }
          }catch (Exception e){
             System.out.println(e);
          }
      } else if (ae.getSource()== signup) {
          setVisible(false);
          new SignupOne().setVisible(true);
      }
}
    public static void main(String args[]){
         new Login();// CLASS OBJ.
    }
}
