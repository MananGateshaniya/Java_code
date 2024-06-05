import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;

public class OptionPaneExample extends WindowAdapter{
    JFrame jf;

    OptionPaneExample() {
        jf = new JFrame();
        jf.setSize(300, 300);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.addWindowListener(this);
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public void windowClosing(WindowEvent e){
        int a=JOptionPane.showConfirmDialog(jf,"are you sure?");
        if (a==JOptionPane.YES_OPTION) {
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
