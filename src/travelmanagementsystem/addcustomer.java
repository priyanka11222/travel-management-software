
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class addcustomer extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1,b2;
    addcustomer(String username){
        setBounds(220, 80, 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(50,50,150,25);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(271, 50, 150, 25);
        add(t1);
        
        JLabel l2=new JLabel("ID :");
        l2.setBounds(50,90,150,25);
        add(l2);
        
        c1 = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
	c1.setBounds(271, 90, 150, 25);
	add(c1);
        
        JLabel l3=new JLabel("Number :");
        l3.setBounds(50,130,150,25);
        add(l3);
        
        t2=new JTextField();
        t2.setBounds(271, 130, 150, 25);
        add(t2);
        
        JLabel l4=new JLabel("Name :");
        l4.setBounds(50,160,150,25);
        add(l4);
        
        t3=new JTextField();
        t3.setBounds(271, 160, 150, 25);
        add(t3);
        
        JLabel l5 = new JLabel("Gender :");
	l5.setBounds(50, 200, 200, 14);
	add(l5);
                
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(271, 200, 80, 12);
        add(r1);
                
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 200, 100, 12);
	add(r2);
        
        JLabel l6 = new JLabel("Country :");
	l6.setBounds(50, 250, 200, 14);
	add(l6);
                
        t4 = new JTextField();
        t4.setBounds(271, 250, 150, 20);
	add(t4);
		
	JLabel l7 = new JLabel("Permanent Address :");
	l7.setBounds(50, 290, 200, 14);
	add(l7);
                
        t5 = new JTextField();
	t5.setBounds(271, 290, 150, 20);
	add(t5);
           	
	JLabel l8 = new JLabel("Phone :");
	l8.setBounds(50, 330, 200, 14);
	add(l8);
                
        t6 = new JTextField();
	t6.setBounds(271, 330, 150, 20);
	add(t6);
		
        JLabel l9 = new JLabel("Email :");
	l9.setBounds(50, 360, 200, 14);
        add(l9);
		
	t8 = new JTextField();
	t8.setBounds(271, 360, 150, 20);
	add(t8);
        
        b1=new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(70, 410, 100, 25);
        b1.addActionListener(this);
        add(b1);
        
         b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(220, 410, 100, 25);
        b2.addActionListener(this);
        add(b2);
        
          ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/newcustomer.jpg"));
          Image i3 = i1.getImage().getScaledInstance(400, 500,Image.SCALE_DEFAULT);
          ImageIcon i2 = new ImageIcon(i3);
          JLabel l10 = new JLabel(i2);
          l10.setBounds(400,40,450,420);
          add(l10);
          
          try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
                    while(rs.next()){
                        t1.setText(rs.getString("username"));  
                        t3.setText(rs.getString("name"));
                    }
                }catch(Exception e){ }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username=t1.getText();
            String id=(String)c1.getSelectedItem();
            String number=t2.getText();
            String name=t3.getText();
            String radio=null;
            if(r1.isSelected()){
                radio="male";
            }else if(r2.isSelected()){
                radio="female";
            }
            String country=t4.getText();
            String address=t5.getText();
            String phone=t6.getText();
            String email=t8.getText();

            String q="insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
            try{
                conn c=new conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Customer Details AddedSuccessfully");
                this.setVisible(false);

            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
        
        }
    
    
    public static void main(String[] args){
       new addcustomer("").setVisible(true);
    }
}
