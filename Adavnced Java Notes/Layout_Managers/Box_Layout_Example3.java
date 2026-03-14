import java.awt.*;
import javax.swing.*;
class Box_Layout_Example3 extends JFrame
{
    JButton b1,b2,b3,b4,b5;
    java.awt.Container c;
    Box_Layout_Example3()
    {
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        c=getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.LINE_AXIS));

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Box_Layout_Example3();
    }
}