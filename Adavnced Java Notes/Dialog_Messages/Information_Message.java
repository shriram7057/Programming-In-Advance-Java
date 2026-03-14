package Dialog_Messages;
import javax.swing.*;
import java.awt.*;
public class Information_Message 
{
    JFrame f;
    Information_Message()
    {
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(f,"Hello Welcome ","Information",JOptionPane.INFORMATION_MESSAGE);
    }   
    public static void main(String[] args) {
        new Information_Message();
    } 
}
