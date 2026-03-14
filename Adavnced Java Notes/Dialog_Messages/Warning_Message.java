package Dialog_Messages;
import javax.swing.*;
import java.awt.*;
public class Warning_Message 
{
    JFrame f;
    Warning_Message()
    {
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(f,"Hello Welcome ","Warning",JOptionPane.WARNING_MESSAGE);
    }   
    public static void main(String[] args) 
    {
        new Warning_Message();
    } 
}
