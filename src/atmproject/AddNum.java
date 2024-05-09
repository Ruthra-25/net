/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;

/**
 *
 * @author itsupport
 */
public class AddNum extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    
    public AddNum(){
        super("ADD NUMBERS");
        l1 = new JLabel("first value");
        l2=new JLabel("second value");
        l3=new JLabel("result");
        
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);

        b1=new JButton("Add");
        setLayout(new FlowLayout(FlowLayout.CENTER,150,10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        
        add(b1);
        b1.addActionListener(this);
        setSize(400,300);
        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e){
        int x=Integer.parseInt(t1.getText());
        int y=Integer.parseInt(t2.getText());
        int sum=x+y;
        t3.setText(String.valueOf(sum));
    }
    public static void main (String args[]){
        new AddNum();
    }
}
