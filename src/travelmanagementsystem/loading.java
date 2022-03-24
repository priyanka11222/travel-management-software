package travelmanagementsystem;
import javax.swing.*;
import java.awt.*;
 public class loading extends JFrame implements Runnable{
     JProgressBar p;
     Thread t;
     String username;
     public void run(){
         try{
             for(int i=1;i<=101;i++){
                  int m = p.getMaximum();
                    int n = p.getValue();
                     if (n < m) {
                        p.setValue(p.getValue() + 1);
                    } else {
                        i = 101;
                        setVisible(false);
                        new dashboard(username).setVisible(true);
                        
                    }
                    Thread.sleep(50);
             }
             
         }catch(Exception e){}
     }
     
     loading(String user){
          username=user;
         t=new Thread(this);
         
          setBounds(300, 150, 600, 400);          
            setLayout(null);

            getContentPane().setBackground(Color.WHITE);
            
           JLabel l1=new JLabel("Travel and Tourism Application");
           l1.setBounds(40, 46, 700, 35);
           l1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
           l1.setForeground(new Color(72, 209, 204));
           add(l1);
           
           p=new JProgressBar();
           p.setStringPainted(true);
           p.setBounds(150, 125, 300, 25);
           add(p);
           
            JLabel l2=new JLabel("Please Wait.....");
           l2.setBounds(230, 156, 150, 25);
           l2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
           l2.setForeground(Color.RED);
           add(l2);
           
           JLabel l3=new JLabel("Welcome "+ username);
           l3.setBounds(20, 300, 150, 25);
           l3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
           l3.setForeground(Color.RED);
           add(l3);
           
           t.start();
    }
 public static void main(String[] args){
     new loading("").setVisible(true);
 }
} 