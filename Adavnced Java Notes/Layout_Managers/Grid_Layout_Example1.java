import java.awt.*;
import javax.swing.*;
class Grid_Layout_Example1 extends JFrame
{
    JButton b1,b2,b3,b4,b5;
    java.awt.Container c;
    Grid_Layout_Example1()
    {
        setSize(500,500);
        setVisible(true);
        c=getContentPane();

        GridLayout gl=new GridLayout();//no rows and columns between the components
        c.setLayout(gl);

        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
    }
    public static void main(String[] args) 
    {
        new Grid_Layout_Example1();
    }
}
// The Java GridLayout class is used to arrange the components in a rectangular grid. 
// One component is displayed in each rectangle.