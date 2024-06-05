import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class flow {
    public static void main(String[] args) {
        JFrame fj = new JFrame("Demonstration of Flow Layout");
        fj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtn1 = new JButton("Button A");
        JButton jbtn2 = new JButton("Button B");
        JButton jbtn3 = new JButton("Button C");
        JPanel pnl = new JPanel();
        pnl.setLayout(new FlowLayout());
        pnl.add(jbtn1);
        pnl.add(jbtn2);
        pnl.add(jbtn3);
        fj.add(pnl);
        fj.pack();
        fj.setVisible(true);
    }
}
