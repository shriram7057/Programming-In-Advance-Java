import java.awt.*;
import javax.swing.*;
class Grid_Layout_Example3 extends JFrame
{
    JButton b1,b2,b3,b4,b5;
    java.awt.Container c;
    Grid_Layout_Example3()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();

        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");

        c.setLayout(new GridLayout(3,3,20,25));//Creates a Grid with given rows and Columns and vertical and Horizontal Gap between the components 

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Grid_Layout_Example3();
    }
}