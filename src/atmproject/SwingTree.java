/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author itsupport
 */
public class SwingTree {
    SwingTree(){
        JFrame f=new JFrame();
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);
        
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode yellow=new DefaultMutableTreeNode("yellow");
        color.add(red);
        color.add(green);
        color.add(blue);
        color.add(yellow);

        JTree t = new JTree(style);
        f.add(t);
        f.setSize(300,200);
        f.setVisible(true);

    }
    public static void main(String args[]){
        new SwingTree();
    }
}
