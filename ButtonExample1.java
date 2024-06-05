import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ButtonExample1 {
    ButtonExample1() throws IOException {
        JFrame f = new JFrame("Button Example");

        BufferedImage bufferedImage = ImageIO.read(new File("1.jpg"));
        Image image = bufferedImage.getScaledInstance(75, 40, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(image);
        JButton b = new JButton(icon);
        b.setBounds(100, 100, 200, 80);
        f.add(b);
        f.setSize(600, 600);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        new ButtonExample1();
    }
}