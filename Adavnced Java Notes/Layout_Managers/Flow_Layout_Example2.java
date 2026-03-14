import javax.swing.*;
import java.awt.*;

class Flow_Layout_Example2 extends JFrame {

    Flow_Layout_Example2() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);

        java.awt.Container c = getContentPane();

        JButton b1 = new JButton("Button");
        JButton b2 = new JButton("Button");
        JButton b3 = new JButton("Button");
        JButton b4 = new JButton("Button");
        JButton b5 = new JButton("Button");

        // Add buttons to the container
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        // Set the layout
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 10, 20);
        c.setLayout(f);
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        SwingUtilities.invokeLater(() -> new Flow_Layout_Example2());
    }
}
