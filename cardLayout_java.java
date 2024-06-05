import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class cardLayout_java extends JFrame {
    private int currCard = 1;
    private CardLayout cObjl;

    public cardLayout_java() throws IOException {
        setTitle("Card Layout Methods");
        setSize(700, 700);
        JPanel jp = new JPanel();

        cObjl = new CardLayout();
        jp.setLayout(cObjl);
        JPanel jP1 = new JPanel();
        JPanel jP2 = new JPanel();
        JPanel jP3 = new JPanel();
        JPanel jP4 = new JPanel();
        BufferedImage buImg1 = ImageIO.read(new File("1.jpg"));
        Image image1 = buImg1.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img1 = new ImageIcon(image1);
        JLabel jL1 = new JLabel(img1);
        BufferedImage buImg2 = ImageIO.read(new File("download(3).jpg"));
        Image image2 = buImg2.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image2);
        JLabel jL2 = new JLabel(img2);
        BufferedImage buImg3 = ImageIO.read(new File("download(5).jpg"));
        Image image3 = buImg3.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(image3);
        JLabel jL3 = new JLabel(img3);
        BufferedImage buImg4 = ImageIO.read(new File("download(1).jpg"));
        Image image4 = buImg4.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon img4 = new ImageIcon(image4);
        JLabel jL4 = new JLabel(img4);
        jP1.add(jL1);
        jP2.add(jL2);
        jP3.add(jL3);
        jP4.add(jL4);
        jp.add(jP1, "1");

        jp.add(jP2, "2");
        jp.add(jP3, "3");
        jp.add(jP4, "4");
        JPanel btnPanel = new JPanel();
        JButton firstButton = new JButton("First");
        JButton nextButton = new JButton("->");
        JButton previousButton = new JButton("<-");
        JButton lastButton = new JButton("Last");
        btnPanel.add(firstButton);
        btnPanel.add(nextButton);
        btnPanel.add(previousButton);
        btnPanel.add(lastButton);
        firstButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cObjl.first(jp);
                currCard = 1;
            }
        });
        lastButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cObjl.last(jp);
                currCard = 4;
            }
        });
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (currCard < 4) {
                    currCard = currCard + 1;
                    cObjl.show(jp, "" + (currCard));
                } else {

                    currCard = 1;
                    cObjl.show(jp, "" + (currCard));
                }
            }
        });
        previousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (currCard > 1) {
                    currCard = currCard - 1;
                    cObjl.show(jp, "" + (currCard));
                } else {
                    currCard = 4;
                    cObjl.show(jp, "" + (currCard));
                }
            }
        });
        getContentPane().add(jp, BorderLayout.NORTH);
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }

    public static void main(String argvs[]) throws IOException {
        cardLayout_java cll = new cardLayout_java();
        cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cll.setVisible(true);
    }
}