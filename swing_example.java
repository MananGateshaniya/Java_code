import javax.swing.*;

public class swing_example {
    @SuppressWarnings("rawtypes")
    swing_example() {
        JFrame a = new JFrame("Java Swing Example");
        JButton b = new JButton("click me");
        b.setBounds(30, 30, 100, 30);
        JTextField tf = new JTextField("text field");
        tf.setBounds(150, 30, 100, 30);
        JScrollBar scr = new JScrollBar();
        scr.setBounds(420, 30, 40, 420);
        JMenu menu;
        JMenuItem a1, a2;
        menu = new JMenu("options");
        JMenuBar m1 = new JMenuBar();
        a1 = new JMenuItem("example");
        a2 = new JMenuItem("example1");
        menu.add(a1);
        menu.add(a2);
        m1.add(menu);
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("first item");
        l.addElement("second item");
        JList<String> jl = new JList<>(l);
        jl.setBounds(30, 80, 75, 75);
        JLabel b1;
        b1 = new JLabel("this is sample code");
        b1.setBounds(125, 80, 130, 30);
        String courses[] = { "core java", "advance java", "java servlet" };
        @SuppressWarnings("unchecked")
        JComboBox cb = new JComboBox(courses);
        cb.setBounds(270, 80, 120, 30);
        a.add(b);
        a.add(tf);
        a.add(scr);
        a.setJMenuBar(m1);
        a.add(jl);
        a.add(b1);
        a.add(cb);
        a.setSize(500, 500);
        a.setLayout(null);
        a.setVisible(true);
    }
    public static void main(String args[]) {
        new swing_example();
    }
}
