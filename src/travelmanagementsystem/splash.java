
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class splash {
    public static void main(String[] args){
        splashframe f1 = new splashframe();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=500; i+=10, x+=5){
            f1.setLocation(600 - ((i+x)/2), 300 - (i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }
}
 class splashframe extends JFrame implements Runnable{
     Thread t1;
     splashframe(){
         setLayout(new FlowLayout());
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/splash.jpg"));
         Image i2=i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel l1=new JLabel(i3);
         
         add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
         
     }
      public void run(){
        try{
            Thread.sleep(5000);
            this.setVisible(false);
            
           
            new login().setVisible(true);
        }catch(Exception e){
            
        }
      }
    
}