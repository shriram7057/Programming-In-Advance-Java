package Dialog_Messages;
import javax.swing.*;
import java.awt.*;
public class Error_Message 
{
    JFrame f;
    Error_Message()
    {
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(f,"Hello Welcome ","Error",JOptionPane.ERROR_MESSAGE);
    }   
    public static void main(String[] args) {
        new Error_Message();
    } 
}
