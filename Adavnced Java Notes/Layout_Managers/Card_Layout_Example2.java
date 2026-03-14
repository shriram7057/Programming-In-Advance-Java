import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Card_Layout_Example2 extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    java.awt.Container c;
    CardLayout cl;
    Card_Layout_Example2()
    {
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");

       cl=new CardLayout(30,40);
       c.setLayout(cl);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        cl.next(c);
    }
    public static void main(String[] args) {
        new Card_Layout_Example2();
    }
}