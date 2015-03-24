/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Appform extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JRadioButton r1,r2;
    JButton submit,reset;
    Appform(){
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hostel Application Form");
        
        l1 = new JLabel("Application Form");
        //l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 22));
        
        l2 = new JLabel("Name:");
        l3 = new JLabel("Roll No:");
        l4 = new JLabel("Email-ID:");
        l5 = new JLabel("Phone No.:");
        l6 = new JLabel("State:");
        
        r1=new JRadioButton("Delhi");
        r2=new JRadioButton("Outside Delhi",true);
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
       
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        
        submit = new JButton("Submit");
        reset = new JButton("Reset");
 
       /* r1.addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                JOptionPane.showMessageDialog(null,"Your request can't be processed now!!!");
                //JOptionPane.showMessageDialog("You are Not eligible now", "alert", "alert", JOptionPane.ERROR_MESSAGE);
            }
            
        });*/
        r1.addActionListener(this);
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        l1.setBounds(200, 30, 400, 30);
        //l1.setVisible(true);
        l2.setBounds(80, 110, 200, 30);
        l3.setBounds(80, 150, 200, 30);
        l4.setBounds(80, 190, 200, 30);
        l5.setBounds(80, 230, 200, 30);
        l6.setBounds(80, 270, 200, 30);
        
        t1.setBounds(300, 110, 200, 30);
        t2.setBounds(300, 150, 200, 30);
        t3.setBounds(300, 190, 200, 30);
        t4.setBounds(300, 230, 200, 30);
        r1.setBounds(300, 270, 200, 30);
        r2.setBounds(300, 290, 200, 30);
        
        submit.setBounds(80, 350, 100, 30);
        //submit.setVisible(true);
        reset.setBounds(300, 350, 100, 30);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
       // add(group);
        add(r1);
        add(r2);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(submit);
        add(reset);
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        {
           
            if(e.getSource()==submit){
               if(r1.isSelected()){
               JOptionPane.showMessageDialog(null,"Your request can't be processed now!!!"); 
               t1.setText("");
               t2.setText("");
               t3.setText("");
               t4.setText("");
               r1.setSelected(false);
               r2.setSelected(true);
               }
               else{
                   
               }
            }
            if(e.getSource()==reset) {
               t1.setText("");
               t2.setText("");
               t3.setText("");
               t4.setText("");
               r1.setSelected(false);
               r2.setSelected(true);
            }
        }
    }
    
}
