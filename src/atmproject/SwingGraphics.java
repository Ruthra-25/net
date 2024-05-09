/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
/**
 *
 * @author itsupport
 */
public class SwingGraphics extends Canvas {
      public void paint(Graphics g) {  
        g.drawString("ruthu",40,40);  
        setBackground(Color.blue);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.white);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
          
    }  
        public static void main(String[] args) {  
        SwingGraphics m=new SwingGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
}
