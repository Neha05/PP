
package appform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainPage extends JFrame implements ActionListener {
    
    JButton b1,b2,b3,b4;
  
    MainPage(){
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1=new JButton("Apply Online"); 
        b2=new JButton("Room Selection"); 
        b3=new JButton("Check Status"); 
        b4=new JButton("Complaint/Suggestions");
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        b1.setBounds(200, 100, 200, 30);
        b2.setBounds(200, 150, 200, 30);
        b3.setBounds(200, 200, 200, 30);
        b4.setBounds(200, 250, 200, 30);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
     public static void main(String[] args) {
        
        new MainPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
           new Appform(); 
        }
        else if(e.getSource()==b2){
            
        }
        else if(e.getSource()==b3){
           // new MessMenu();
        }
        else{   
            new Complaint();
        }
    }
}
