import java.awt.*;
import java.awt.event.*;

public class AdapterExample1 extends WindowAdapter {
    Frame f;

    AdapterExample1() {
        f = new Frame();
        f.addWindowListener(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        new AdapterExample1();
    }
}
