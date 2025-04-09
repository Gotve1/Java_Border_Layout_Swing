package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {

    /**
     * This is Main class which creates
     * a Windows with attached label
     * on center of window and in bottom
     */

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Directions Of BorderLayout"); // Create a new JFrame with the title "Hello, World!"
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        frame1.setSize(300, 300); // Set the size of the window
        frame1.setLocationRelativeTo(null); // Center the window on the screen


        JPanel panel1 = getPanel();


        frame1.add(panel1);


        frame1.setVisible(true);
    }

    /**
     * This method creates a JPanel with BorderLayout
     * and adds labels to different positions in the layout.
     *
     * @return JPanel with labels added to different positions
     */
    public static JPanel getPanel() {

        // Main panel with BorderLayout
        JPanel panel1 = new JPanel(new BorderLayout());

        // Add other labels for demonstration
        JLabel label1 = new JLabel("JLabel1", SwingConstants.CENTER);
        JLabel label2 = new JLabel("JLabel2", SwingConstants.CENTER);
        JLabel label3 = new JLabel("JLabel3", SwingConstants.CENTER);
        JLabel label4 = new JLabel("JLabel4", SwingConstants.CENTER);
        JLabel label5 = new JLabel("JLabel5", SwingConstants.CENTER);

        // Add labels to the panel
        panel1.add(label1, BorderLayout.NORTH);
        panel1.add(label2, BorderLayout.WEST);
        panel1.add(label3, BorderLayout.SOUTH);
        panel1.add(label4, BorderLayout.EAST);
        panel1.add(label5, BorderLayout.CENTER);

        return panel1;
    }
}