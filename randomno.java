import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class randomno {
    public static void main(String[] args) {
        // Declare a Frame object
        JFrame frame = new JFrame();
        // Disable default frame layout
        frame.setLayout(null);
        // Create a button object
        JButton btn = new JButton("Generate Number");
        // Set the font type of the button
        btn.setFont(new Font("Verdana", Font.BOLD, 20));
        // Set the button position
        btn.setBounds(45, 50, 250, 40);
        // Add button to the frame
        frame.add(btn);
        // Add the action listener for the button
        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Random num=new Random();
                int n=num.nextInt(1000)+1;
                String s=String.valueOf(n);
                JOptionPane.showMessageDialog(frame,"number is"+s);
            }
        });
        // Set the title
        frame.setTitle("Java Swing Example-14");
        // Set the window size
        frame.setSize(350, 200);
        // Disable the resize option
        frame.setResizable(false);
        // Set window position
        frame.setLocationRelativeTo(null);
        // Make the window visible
        frame.setVisible(true);
    }
}
