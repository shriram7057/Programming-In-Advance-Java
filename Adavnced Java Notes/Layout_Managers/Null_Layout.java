// package Layout_Managers;
import java.awt.*;
import javax.swing.*;
class Null_Layout extends JFrame
{
    JButton b1,b2;
    // JLabel l1,l2;
    Null_Layout()
    {
        java.awt.Container c=getContentPane();
        c.setLayout(null);//Applay the Layout as Null
        setSize(500,500);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.CYAN);

        b1=new JButton("Submit");
        b2=new JButton("Cancel");

        b1.setForeground(Color.RED);
        b2.setForeground(Color.RED);

        b1.setBounds(50,100,80,20);
        b2.setBounds(50,200,80,20);

        c.add(b1);
        c.add(b2);
    }
    public static void main(String[] args) {
        new Null_Layout();
    }
}