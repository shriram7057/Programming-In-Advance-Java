package Dialog_Messages;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Input_Dialog2 extends JFrame implements ActionListener 
{
    Input_Dialog2()
    {
        setVisible(true);
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        JButton b1 = new JButton("Click Here");
        c.add(b1);
        b1.setBounds(150, 150, 100, 40); // Set button position and size
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        String str = JOptionPane.showInputDialog("Enter Your Name");
        if (str != null && str.length() > 0) 
        {
            System.out.println("The Name is " + str);
        }
    }

    public static void main(String[] args) 
    {
        new Input_Dialog2();
    }
}
