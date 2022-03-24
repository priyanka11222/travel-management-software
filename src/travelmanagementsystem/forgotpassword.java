package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class forgotpassword extends JFrame implements ActionListener{
    private JTextField t1,t2,t3,t4,t5;
     private JButton b1,b2,b3;
    forgotpassword()
    {
        setBounds(230, 120, 850, 400);
	getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JPanel p=new JPanel();
        p.setLayout(null);
        p.setBounds(30,30,500,300);
        add(p);
        
        JLabel l1 = new JLabel("Username");
	l1.setFont(new Font("Tahoma", Font.BOLD, 13));
	l1.setBounds(70, 83, 87, 29);
	p.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setFont(new Font("Tahoma", Font.BOLD, 13));
	l2.setBounds(70, 122, 75, 21);
	p.add(l2);

	JLabel l3 = new JLabel("Your Security Question");
	l3.setFont(new Font("Tahoma", Font.BOLD, 13));
	l3.setBounds(70, 154, 156, 27);
	p.add(l3);

	JLabel l4 = new JLabel("Answer");
	l4.setFont(new Font("Tahoma", Font.BOLD, 13));
	l4.setBounds(70, 192, 104, 21);
	p.add(l4);
        
        JLabel l5 = new JLabel("Password");
	l5.setFont(new Font("Tahoma", Font.BOLD, 13));
	l5.setBounds(70, 224, 104, 21);
	p.add(l5);

        
        t1 = new JTextField();
	t1.setFont(new Font("Tahoma", Font.BOLD, 13));
	t1.setBounds(250, 88, 139, 20);
	p.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	
	t2.setFont(new Font("Tahoma", Font.BOLD, 13));
	t2.setColumns(10);
	t2.setBounds(250, 123, 139, 20);
	p.add(t2);

	t3 = new JTextField();
	
	t3.setFont(new Font("Tahoma", Font.BOLD, 12));
	t3.setColumns(10);
	t3.setBounds(250, 161, 221, 20);
	p.add(t3);

	t4 = new JTextField();
	t4.setFont(new Font("Tahoma", Font.BOLD, 13));
	t4.setColumns(10);
	t4.setBounds(250, 193, 139, 20);
	p.add(t4);

	t5 = new JTextField();
	
	t5.setFont(new Font("Tahoma", Font.BOLD, 13));
	t5.setColumns(10);
	t5.setBounds(250, 225, 139, 20);
	p.add(t5);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/forgotpassword.jpg"));
        Image i1 = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l6 = new JLabel(i2);
        l6.setBounds(560, 70, 200, 200);
        add(l6);
        
        b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 12));
	b1.setBounds(400, 83, 80, 29);
	b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p.add(b1);

	b2 = new JButton("Retrieve");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 12));
	b2.setBounds(400, 188, 85, 29);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	p.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 13));
	b3.setBounds(233, 270, 101, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	p.add(b3);

    }
     public void actionPerformed(ActionEvent ae){
         conn c=new conn();
         if(ae.getSource()==b1){
             try{
               String sql="select * from account where username = '"+t1.getText()+"'";
                ResultSet rs=c.s.executeQuery(sql);
                while(rs.next()){
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                }
             }catch(Exception e){}   
             
     }else if(ae.getSource()==b2){
         try{
               String sql="select * from account where ans = '"+t4.getText()+"' AND username = '"+t1.getText()+"'";
                ResultSet rs=c.s.executeQuery(sql);
                while(rs.next()){
                    t5.setText(rs.getString("password"));
                }
             }catch(Exception e){}
         
     }else if(ae.getSource()==b3){
                this.setVisible(false);
		new login().setVisible(true);
     }
     }
    public static void main(String[] args) {
	new forgotpassword().setVisible(true);
    }
}
