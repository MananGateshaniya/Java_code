//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
//import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;

public class borderlauout extends JFrame {
    borderlauout() {
        setLayout(new BorderLayout());
        setBackground(Color.red);
        Button btn1 = new Button("north");
        Button btn2 = new Button("south");
        Button btn3 = new Button("east");
        Button btn4 = new Button("west");
        Button btn5 = new Button("center");
        add(btn1, "North");
        add(btn2, "South");
        add(btn3, "East");
        add(btn4, "West");
        add(btn5, "Center");
        setTitle("Learning a Border Layout");
        setSize(350,300);
        setVisible(true);
    }

    public static void main(String args[]) {
        new borderlauout();
    }
}
