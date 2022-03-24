

package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class updatecustomer extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1,b2;
    updatecustomer(String username){
        setBounds(220, 80, 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l11=new JLabel("UPDATE CUSTOMER DETAILS");
        l11.setBounds(50, 0, 300, 25);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l11);
        
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(50,50,150,25);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(271, 50, 150, 25);
        add(t1);
        
        JLabel l2=new JLabel("ID :");
        l2.setBounds(50,90,150,25);
        add(l2);
        
        t9=new JTextField();
        t9.setBounds(271, 90, 150, 25);
        add(t9);
        
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
                
        t10=new JTextField();
        t10.setBounds(271, 200, 150, 25);
        add(t10);
        
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
        
        b1=new JButton("Update");
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
        
          ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/update.png"));
          Image i3 = i1.getImage().getScaledInstance(200, 400,Image.SCALE_DEFAULT);
          ImageIcon i2 = new ImageIcon(i3);
          JLabel l10 = new JLabel(i2);
          l10.setBounds(500,40,200,400);
          add(l10);
          
          try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        t1.setText(rs.getString("username"));  
                        t2.setText(rs.getString("number")); 
                        t4.setText(rs.getString("country")); 
                        t5.setText(rs.getString("address")); 
                        t6.setText(rs.getString("phone")); 
                        t8.setText(rs.getString("email")); 
                        t9.setText(rs.getString("id")); 
                        t10.setText(rs.getString("gender")); 
                        t3.setText(rs.getString("name"));
                    }
                }catch(Exception e){ }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username=t1.getText();
            String id=t9.getText();
            String number=t2.getText();
            String name=t3.getText();
            String radio=t10.getText();
            String country=t4.getText();
            String address=t5.getText();
            String phone=t6.getText();
            String email=t8.getText();

            String q="update customer set username='"+username+"', id='"+id+"',number = '"+number+"',name = '"+name+"',gender = '"+radio+"', country = '"+country+"', address = '"+address+"',phone = '"+phone+"', email = '"+email+"'";
            try{
                conn c=new conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Customer Details updated Successfully");
                this.setVisible(false);

            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
        
        }
    
    
    public static void main(String[] args){
       new updatecustomer("").setVisible(true);
    }
}
