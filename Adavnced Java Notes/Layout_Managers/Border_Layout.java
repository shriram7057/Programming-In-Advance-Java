import javax.swing.*;
import java.awt.*;

class Border_Layout extends JFrame {
    JButton b1, b2, b3, b4, b5;
    java.awt.Container c;

    Border_Layout() {
        c = getContentPane();
        
        // Initialize buttons with correct labels
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("West");
        b4 = new JButton("East");
        b5 = new JButton("Center");

        // Create a Border Layout
        BorderLayout bl = new BorderLayout();
        c.setLayout(bl); // Set Border Layout

        // Add buttons to respective positions
        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.EAST);
        c.add(b5, BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        setTitle("Border Layout!");
        // setDefaultClosetOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Border_Layout();
    }
}
//  The BorderLayout is used to arrange the components in five regions: north, south, east, west, and center. Each region
//  (area) may contain one component only. It is the default layout of a frame or window. The BorderLayout provides five 
//  constants for each region: