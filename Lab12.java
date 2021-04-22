package sem3;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Lab12 { 
Lab12(){  
    JFrame f=new JFrame();   
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("CombokBox",new combopanel());  
    tp.add("List",new List());  
    tp.add("Tree",new Treepanel());
    tp.add("Radiobotton",new rpanel());
    f.add(tp);  
    f.setSize(500,600);  
    f.setLayout(null);  
    f.setVisible(true);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}  
    public static void main(String[] args) {
         new Lab12();
    }  
}
class combopanel extends JPanel{
    combopanel(){
     JComboBox combo=new JComboBox();
     combo.addItem("Java");
     combo.addItem("C++");
     combo.addItem("C");

     add(combo);
    }
}
class List extends JPanel{
    List(){
        String cities[]={"Bangalore","Chennai","Hyderabad","Bombay"};
        JList list= new JList(cities);
        JScrollPane scr= new JScrollPane(list);
        scr.setPreferredSize(new Dimension(120,90));
        add(scr);
    }
}
class Treepanel extends JPanel{
    Treepanel(){
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("Programmes");  
    DefaultMutableTreeNode a=new DefaultMutableTreeNode("B.Tech programs");  
    top.add(a);
    DefaultMutableTreeNode a1=new DefaultMutableTreeNode("AI"); 
    DefaultMutableTreeNode a2=new DefaultMutableTreeNode("CTIS"); 
    DefaultMutableTreeNode a3=new DefaultMutableTreeNode("MACT"); 
    DefaultMutableTreeNode a4=new DefaultMutableTreeNode("Data Science"); 
    DefaultMutableTreeNode a5=new DefaultMutableTreeNode("IS"); 
    a.add(a1); a.add(a2);a.add(a3);a.add(a4);a.add(a5);
    JTree ob= new JTree(top);
    add(ob);
    }
}
class rpanel extends JPanel{
    rpanel(){
        ButtonGroup bg= new ButtonGroup();
        JRadioButton m= new JRadioButton("Male");
        add(m);
        JRadioButton f= new JRadioButton("Female");
        add(f);
        bg.add(m);
        bg.add(f);
    }
}