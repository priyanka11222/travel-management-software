
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class viewcustomer extends JFrame implements ActionListener{
    
    
    JButton b2;
    viewcustomer(String username){
        setBounds(200, 10, 850, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(50,50,150,25);
        add(l1);
        
        JLabel l11=new JLabel();
        l11.setBounds(220,50,150,25);
        add(l11);
        
        JLabel l2=new JLabel("ID :");
        l2.setBounds(50,110,150,25);
        add(l2);
        
        JLabel l12=new JLabel();
        l12.setBounds(220,110,150,25);
        add(l12);
        
        JLabel l3=new JLabel("Number :");
        l3.setBounds(50,170,150,25);
        add(l3);
        
        JLabel l13=new JLabel();
        l13.setBounds(220,170,150,25);
        add(l13);
        
        JLabel l4=new JLabel("Name :");
        l4.setBounds(50,230,150,25);
        add(l4);
        
        JLabel l14=new JLabel();
        l14.setBounds(220,230,150,25);
        add(l14);
        
        JLabel l5 = new JLabel("Gender :");
	l5.setBounds(50, 290, 200, 14);
	add(l5);
                
        JLabel l15=new JLabel();
        l15.setBounds(220,290,150,25);
        add(l15);
        
        JLabel l6 = new JLabel("Country :");
	l6.setBounds(500, 50, 200, 14);
	add(l6);
                
        JLabel l16=new JLabel();
        l16.setBounds(690,50,150,25);
        add(l16);
		
	JLabel l7 = new JLabel("Permanent Address :");
	l7.setBounds(500, 110, 200, 14);
	add(l7);
                
        JLabel l17=new JLabel();
        l17.setBounds(690,110,150,25);
        add(l17);
           	
	JLabel l8 = new JLabel("Phone :");
	l8.setBounds(500, 170, 200, 14);
	add(l8);
                
        JLabel l18=new JLabel();
        l18.setBounds(690,170,150,25);
        add(l18);
		
        JLabel l9 = new JLabel("Email :");
	l9.setBounds(500, 230, 200, 14);
        add(l9);
		
	
        
        JLabel l19=new JLabel();
        l19.setBounds(690,230,150,25);
        add(l19);
        
         b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(320, 350, 100, 25);
        b2.addActionListener(this);
        add(b2);
        
          ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/viewall.jpg"));
          Image i3 = i1.getImage().getScaledInstance(600, 201,Image.SCALE_DEFAULT);
          ImageIcon i2 = new ImageIcon(i3);
          JLabel l10 = new JLabel(i2);
          l10.setBounds(0,420,600,201);
          add(l10);
          
          ImageIcon i14  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/viewall.jpg"));
          Image i5 = i14.getImage().getScaledInstance(600, 201,Image.SCALE_DEFAULT);
          ImageIcon i6 = new ImageIcon(i5);
          JLabel l20 = new JLabel(i2);
          l20.setBounds(580,420,600,201);
          add(l20);
          
          try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l11.setText(rs.getString("username"));  
                        l13.setText(rs.getString("number")); 
                        l16.setText(rs.getString("country")); 
                        l17.setText(rs.getString("address")); 
                        l18.setText(rs.getString("phone")); 
                        l19.setText(rs.getString("email")); 
                        l12.setText(rs.getString("id")); 
                        l15.setText(rs.getString("gender")); 
                        l14.setText(rs.getString("name"));
                    }
                }catch(Exception e){ }
        
    }
    
    public void actionPerformed(ActionEvent ae){
       
         
         if(ae.getSource()==b2){
            this.setVisible(false);
        }
        
        }
    
    
    public static void main(String[] args){
       new viewcustomer("").setVisible(true);
    }
}

