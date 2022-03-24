
package travelmanagementsystem;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class payment extends JFrame{
   payment(){
       setLayout(null);
        setBounds(250, 20, 800, 600);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/paytm.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 80, 800, 500);
        add(l4);
        
        JButton pay = new JButton("Pay");
        pay.setBounds(420, 20, 80, 40);
        add(pay);
    
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(510, 20, 80, 40);
        add(back);
   } 
   public static void main(String[] args){
       new payment().setVisible(true);
   }
}
