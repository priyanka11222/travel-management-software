
package travelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    JButton b1 ,b2, b3 ;
    JTextField t1;
    JPasswordField t2;
    login(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(300, 100, 600, 400);
        
        JPanel j1=new JPanel();
        j1.setBackground(new Color(131, 193, 233));
        j1.setBounds(0, 0, 250, 400);
        j1.setLayout(null);
        add(j1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/login.png"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(25, 100, 200, 200);
        j1.add(l1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(250, 30, 450, 300);
        add(p2);
        
       JLabel l2=new JLabel("Username"); 
       l2.setBounds(60, 20, 100, 25);
       l2.setFont(new Font("SANS_SERIF",Font.PLAIN, 20));
       p2.add(l2);
       
        t1= new JTextField();
	t1.setBounds(60, 50, 200, 25);
	p2.add(t1);
        
        JLabel l3=new JLabel("Password");
        l3.setBounds(60, 80, 100, 25);
        l3.setFont(new Font("SANS_SERIF", Font.PLAIN,20));
        p2.add(l3);
        
         t2=new JPasswordField();
        t2.setBounds(60, 110, 200, 25);
        p2.add(t2);
        
         b1=new JButton("Login");
        b1.addActionListener(this);
        b1.setBounds(60 ,150, 100, 25);
        p2.add(b1);
        
         b2=new JButton("Sign Up");
        b2.addActionListener(this);
        b2.setBounds(180 ,150, 100, 25);
        p2.add(b2);
        
          b3=new JButton("Forgot Password");
         b3.addActionListener(this);
        b3.setBounds(60 ,190, 200, 25);
        p2.add(b3);
                    
        
        setVisible(true);
        
        
    }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==b1){
             try{
                 String username= t1.getText();
                 String password =t2.getText();
                 String sql= "select * from account where username= '"+username+"'AND password= '"+password+"' ";
                 conn c=new conn();
                 ResultSet rs=c.s.executeQuery(sql);
                 if(rs.next()){
                     this.setVisible(false);
                     new loading(username).setVisible(true);
                 }else{
                     JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                     
                 }
                 
             }catch(Exception e){}
         }
         
           if(ae.getSource()==b2){
               this.setVisible(false);
               new SignUp().setVisible(true);
           
        }else if(ae.getSource()==b3){
            this.setVisible(false);
            new forgotpassword().setVisible(true);
        }

        
     }
    
    public static void main(String[] args){
        new login();
    }
}
