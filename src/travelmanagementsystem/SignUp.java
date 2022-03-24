
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class SignUp extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    JComboBox co1;
    SignUp(){
        setBounds( 300, 100, 600, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(50, 86, 92, 26);
	p1.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(50, 123, 92, 26);
	p1.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPassword.setBounds(50, 160, 92, 26);
	p1.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer.setBounds(50, 234, 92, 26);
	p1.add(lblAnswer);
        
         co1 = new JComboBox();
	co1.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?" }));
	co1.setBounds(200, 202, 148, 20);
	p1.add(co1);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(50, 197, 140, 26);
	p1.add(lblSecurityQuestion);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/signup.png"));
        Image i1 = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l6 = new JLabel(i2);
        l6.setBounds(390, 70, 200, 200);
        add(l6);

         t1= new JTextField();
	t1.setBounds(200, 91, 160, 20);
	p1.add(t1);
	t1.setColumns(10);

	 t2 = new JTextField();
	t2.setColumns(10);
	t2.setBounds(200, 128, 160, 20);
	p1.add(t2);

         t3 = new JTextField();
	t3.setColumns(10);
	t3.setBounds(200, 165, 160, 20);
	p1.add(t3);

	 t4 = new JTextField();
	t4.setColumns(10);
	t4.setBounds(200, 239, 160, 20);
	p1.add(t4);
        
         b1 = new JButton("Create");
	b1.setFont(new Font("Tahoma", Font.BOLD, 13));
	b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
	p1.add(b1);

	 b2 = new JButton("Back");
	b2.setFont(new Font("Tahoma", Font.BOLD, 13));
	b2.setBounds(270, 289, 100, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
	p1.add(b2);
        
    }
    
    public void actionPerformed(ActionEvent ae){
         
        
        if(ae.getSource()==b1 )
        {
            String username=t1.getText();
            String name=t2.getText();
            String password=t3.getText();
            String security=(String) co1.getSelectedItem();
            String answer=t4.getText();
            
            String query="insert into account values('"+username+"', '"+name+"', '"+password+"','"+security+"', '"+answer+"')";
	    try{
                conn c=new conn();
                 c.s.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null, "Account Created Successfully ");
                    
                    this.setVisible(false);
                    new login().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
            
            
            
            
        }else if(ae.getSource()==b2){
            new login().setVisible(true);
            this.setVisible(false);
        }
            
    }
    
    public static void main(String[] args){
        new SignUp().setVisible(true);
    }

    
}
