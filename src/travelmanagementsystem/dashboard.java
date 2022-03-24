
package travelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener{
    JButton b13,b14,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b15;
    String username;
    dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 50);
        p1.setBackground(new Color(0 ,0 ,102));
        add(p1);
        
        JLabel l3=new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD, 25));
        l3.setForeground(Color.WHITE);
        l3.setBounds(40 ,3,300,40);
        p1.add(l3);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 50, 250, 1000);
        p2.setBackground(new Color(0 ,0 ,102));
        add(p2);
        
         b1=new JButton(" Add Personal Details ");
         b1.setBackground(new Color(0,0,109));
         b1.setForeground(Color.WHITE);
         b1.setFont(new Font("Tahoma",Font.PLAIN,17));
         b1.setBounds(0,0,250,30);
         b1.addActionListener(this);
         p2.add(b1);
        
          b2=new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.PLAIN,17));
        b2.setBounds(0,30,250,30);
        b2.addActionListener(this);
        p2.add(b2);
        
          b3=new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Tahoma",Font.PLAIN,17));
        b3.setBounds(0,60,250,30);
        b3.addActionListener(this);
        p2.add(b3);
        
          b4=new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Tahoma",Font.PLAIN,17));
        b4.setBounds(0,90,250,30);
        p2.add(b4);
        
          b5=new JButton("Check Package");
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("Tahoma",Font.PLAIN,17));
        b5.setBounds(0,120,250,30);
        b5.addActionListener(this);
        p2.add(b5);
        
          b6=new JButton("Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("Tahoma",Font.PLAIN,17));
        b6.setBounds(0,150,250,30);
        b6.addActionListener(this);
        p2.add(b6);
        
          b7=new JButton("View Package");
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("Tahoma",Font.PLAIN,17));
        b7.setBounds(0,180,250,30);
        p2.add(b7);
        
          b8=new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.WHITE);
        b8.setFont(new Font("Tahoma",Font.PLAIN,17));
        b8.setBounds(0,210,250,30);
        b8.addActionListener(this);
        p2.add(b8);
        
          b9=new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.WHITE);
        b9.setFont(new Font("Tahoma",Font.PLAIN,17));
        b9.setBounds(0,240,250,30);
        b9.addActionListener(this);
        p2.add(b9);
        
          b10=new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.WHITE);
        b10.setFont(new Font("Tahoma",Font.PLAIN,17));
        b10.setBounds(0,270,250,30);
        p2.add(b10);
        
          b11=new JButton("Destinations");
        b11.setBackground(new Color(0,0,102));
        b11.setForeground(Color.WHITE);
        b11.setFont(new Font("Tahoma",Font.PLAIN,17));
        b11.setBounds(0,300,250,30);
        b11.addActionListener(this);
        p2.add(b11);
        
        b12=new JButton("Payment");
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.WHITE);
        b12.setFont(new Font("Tahoma",Font.PLAIN,17));
        b12.setBounds(0,330,250,30);
        p2.add(b12);
        
         b13=new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setForeground(Color.WHITE);
        b13.setFont(new Font("Tahoma",Font.PLAIN,17));
        b13.setBounds(0,360,250,30);
        b13.addActionListener(this);
        p2.add(b13);
        
          b14=new JButton("Notepad");
        b14.setBackground(new Color(0,0,102));
        b14.setForeground(Color.WHITE);
        b14.setFont(new Font("Tahoma",Font.PLAIN,17));
        b14.setBounds(0,390,250,30);
        b14.addActionListener(this);
        p2.add(b14);
        
        b15=new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setForeground(Color.WHITE);
        b15.setFont(new Font("Tahoma",Font.PLAIN,17));
        b15.setBounds(0,420,250,30);
        b15.addActionListener(this);
        p2.add(b15);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1700, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel l1 = new JLabel(i3);
	l1.setBounds(0, 0, 1950, 1000); 
        add(l1);
        
        JLabel l4=new JLabel("Travel And Tourism Management System");
        l4.setBounds(400 , 100,1000,50);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma",Font.PLAIN,40));
        l1.add(l4);
        
        
    }  
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource()== b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource()== b1)
        {
            new addcustomer(username).setVisible(true);
        }else if(ae.getSource()==b2){
            new updatecustomer(username).setVisible(true);
        }else if(ae.getSource()== b3){
            new viewcustomer(username).setVisible(true);
        }else if(ae.getSource()== b5){
            new checkpackage().setVisible(true);
        }else if(ae.getSource()== b6){
            new bookpackage(username).setVisible(true);
        }else if(ae.getSource()== b8){
            new checkhotels().setVisible(true);
        }else if(ae.getSource()== b9){
            new bookhotel(username).setVisible(true);
        }else if(ae.getSource()== b12){
            new payment().setVisible(true);
        }else if(ae.getSource()== b15){
            new about().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new dashboard("").setVisible(true);
    }
}
