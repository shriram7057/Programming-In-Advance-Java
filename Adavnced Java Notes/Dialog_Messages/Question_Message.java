package Dialog_Messages;
import javax.swing.*;
import java.awt.*;
public class Question_Message 
{   
    JFrame f;
    Question_Message()
    {
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(f,"Do you want to close the window?","question",JOptionPane.QUESTION_MESSAGE);
    }
    public static void main(String[] args) 
    {
        new Question_Message();
    }
}
