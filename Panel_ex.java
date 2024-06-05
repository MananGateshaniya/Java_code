//import java.awt.*;
import java.awt.Color;

import javax.swing.*;

public class Panel_ex {
Panel_ex() {
JFrame a1 = new JFrame("without panel");
JButton b1 = new JButton("click me");
b1.setBounds(60, 50, 50, 40);
a1.add(b1);
a1.setSize(400, 400);
a1.setLayout(null);
a1.setVisible(true);
JFrame a = new JFrame("panel");
JPanel p = new JPanel();
p.setBackground(Color.LIGHT_GRAY);
p.setBounds(40, 70, 200, 200); // panel doesn't have border.. so we can't see panel border
JButton b=new JButton("click me");
b.setBounds(60, 50, 50, 40);
p.add(b);
a.add(p);
a.setSize(400, 400);
a.setLayout(null);
a.setVisible(true);

}

    public static void main(String args[]) {
        new Panel_ex();
    }
}
