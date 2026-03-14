import javax.swing.*;
import java.awt.*;
class Flow_Layout_Example1 extends JFrame 
{

    Flow_Layout_Example1() 
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);

        java.awt.Container c = getContentPane();

        JButton b1 = new JButton("Btn1");
        JButton b2 = new JButton("Btn2");
        JButton b3 = new JButton("Btn3");
        JButton b4 = new JButton("Btn4");
        JButton b5 = new JButton("Btn5");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        FlowLayout f = new FlowLayout(FlowLayout.LEFT, 10, 20);
        c.setLayout(f);
    }

    public static void main(String[] args) 
    {
         new Flow_Layout_Example1();
    }
}
// The Java FlowLayout class is used to arrange the components in a line, one after another (in a flow). 
// It is the default layout of the applet or panel
