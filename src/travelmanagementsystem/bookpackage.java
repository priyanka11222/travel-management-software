
package travelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;	
import java.awt.event.*;

public class bookpackage extends JFrame{
    Choice c1,c2,c3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    bookpackage(String username){
        setBounds(220, 120, 800, 450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/bookpackage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(400, 250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(450,50,400,250);
        add(la1);
        
        JLabel l1 = new JLabel("BOOK PACKAGE");
        l1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
	l1.setBounds(118, 11, 300, 53);
	add(l1);
        
        JLabel la2 = new JLabel("Username :");
	la2.setBounds(35, 70, 200, 14);
	add(la2);
                
        JLabel l2 = new JLabel(username);
	l2.setBounds(271, 70, 200, 14);
	add(l2);
                
        JLabel lblId = new JLabel("Select Package :");
        lblId.setBounds(35, 110, 200, 14);
        add(lblId);
        
        c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(271, 110, 150, 30);
        add(c1);
        
        JLabel la3 = new JLabel("Total Persons");
	la3.setBounds(35, 150, 200, 14);
	add(la3);
        
        t1 = new JTextField();
        t1.setText("0");
	t1.setBounds(271, 150, 150, 20);
	add(t1);
	t1.setColumns(10);
                
	JLabel lbl1 = new JLabel("ID :");
	lbl1.setBounds(35, 190, 200, 14);
	add(lbl1);
                
        JLabel l12 = new JLabel();
        l12.setBounds(271, 190, 200, 14);
	add(l12);
        
        JLabel lbl2 = new JLabel("Number :");
	lbl2.setBounds(35, 230, 200, 14);
	add(lbl2);
                
        JLabel l3 = new JLabel();
	l3.setBounds(271, 230, 200, 14);
	add(l3);
           	
        JLabel lbl3 = new JLabel("Phone :");
	lbl3.setBounds(35, 270, 200, 14);
	add(lbl3);
                
        JLabel l4 = new JLabel();
	l4.setBounds(271, 270, 200, 14);
	add(l4);

		
	JLabel lblDeposite = new JLabel("Total Price :");
	lblDeposite.setBounds(35, 310, 200, 14);
	add(lblDeposite);
        
        JLabel l5 = new JLabel();
	l5.setBounds(271, 310, 200, 14);
        l5.setForeground(Color.RED);
	add(l5);
        
        try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l12.setText(rs.getString("id"));
                        l3.setText(rs.getString("number"));
                        l4.setText(rs.getString("phone"));
                        
                    }

                    rs.close();
                }catch(SQLException e){}
        
        b1 = new JButton("Check Price");
	b1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
                    String p = c1.getSelectedItem();
                    int cost = 0;
                    if(p.equals("Gold Package")) {
                         cost += 12000;
                    }if(p.equals("Silver Package")){
                         cost += 25000;
                    }else if(p.equals("Bronze Package")){
                          cost += 32000;
                      }
                            
                        cost *= Integer.parseInt(t1.getText());
                        l5.setText("Rs "+cost);
                            
                           }
		});
	b1.setBounds(50, 350, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
                
       b2=new JButton("Book");
       b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
                         conn c = new conn();
                         
                         try{
	    		       String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookpackage values('"+username+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l12.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
       b2.setBounds(200, 350, 120, 30);
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       add(b2);
       
       b3=new JButton("Back");
       b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
                           setVisible(false);
		}
		}); 
       b3.setBounds(350, 350, 120, 30);
       b3.setBackground(Color.BLACK);
       b3.setForeground(Color.WHITE);
       add(b3);
               
    }
    
    public static void main(String[] args){
        new bookpackage("").setVisible(true);
    }
}
