import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import java.awt.*;

public class all_layouts_demo {
    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        // Flow Layouts
        JFrame f = new JFrame("Layout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define new buttons
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        // Define the panel to hold the buttons
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(jb1);
        p.add(jb2);
        p.add(jb3);
        // Set the window to be visible as the default to be false
        f.add(p);

        f.setSize(300, 300);
        f.pack();
        f.setVisible(true);
        // Border Lyouts
        JFrame f1 = new JFrame("frame with direction");
        // Define new buttons with dif erent regions
        JButton jbn = new JButton("NORTH");
        JButton jbs = new JButton("SOUTH");
        JButton jbw = new JButton("WEST");
        JButton jbe = new JButton("EAST");
        JButton jbc = new JButton("CENTER");
        // Define the panel to hold the buttons
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(jbn, BorderLayout.NORTH);
        p1.add(jbs, BorderLayout.SOUTH);
        p1.add(jbw, BorderLayout.WEST);
        p1.add(jbe, BorderLayout.EAST);
        p1.add(jbc, BorderLayout.CENTER);
        f1.add(p1);
        f1.pack();
        f1.setSize(300, 300);
        f1.setVisible(true);
        // Grid layouts
        JFrame f2 = new JFrame("frame with grid");
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 2));
        JButton jb1g = new JButton("Button 1");
        JButton jb2g = new JButton("Button 2");
        JButton jb3g = new JButton("Button 3");
        JButton jb4g = new JButton("Button 4");
        JButton jb5g = new JButton("Button 5");
        p2.add(jb1g);
        p2.add(jb2g);

        p2.add(jb3g);
        p2.add(jb4g);
        p2.add(jb5g);
        f2.add(p2);
        f2.pack();
        f2.setVisible(true);
        f2.setSize(300, 300);
        // Define the panel to hold the components
        // Put constraints on dif erent buttons with gridbag layouts
        JFrame fg = new JFrame("gridbag constrain");
        JPanel pg = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        pg.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        pg.add(new JButton("Button1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pg.add(new JButton("Button 2"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        pg.add(new JButton("Button 3"), gbc);
        fg.add(pg);
        fg.pack();
        fg.setVisible(true);
        fg.setSize(300, 300);
        // spring layouts
        JFrame sf = new JFrame("spring Layout");
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define the panel to hold the components

        JPanel sp = new JPanel();
        SpringLayout slayout = new SpringLayout();
        JLabel label = new JLabel("Label: ");
        JTextField text = new JTextField("Text field", 15);
        sp.setSize(300, 300);
        sp.setLayout(slayout);
        sp.add(label);
        sp.add(text);
        // Put constraint on components
        slayout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, sp);
        slayout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, sp);
        slayout.putConstraint(SpringLayout.WEST, text, 5, SpringLayout.EAST, label);
        slayout.putConstraint(SpringLayout.NORTH, text, 5, SpringLayout.NORTH, sp);
        // Set the window to be visible as the default to be false
        sf.add(sp);
        sf.pack();
        sf.setVisible(true);
        sf.setSize(300, 300);
        JFrame fgl = new JFrame("Group Layout");
        fgl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbgl1 = new JButton("1");
        JButton jbgl2 = new JButton("2");
        JButton jbgl3 = new JButton("3");
        JButton jbgl4 = new JButton("4");
        // Define the panel to hold the buttons
        JPanel pgl = new JPanel();
        pgl.setSize(300, 300);
        GroupLayout gl = new GroupLayout(pgl);
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);
        pgl.setLayout(gl);
        // Set for horizontal and vertical group
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(jbgl1).addComponent(jbgl2)

                .addGroup(gl.createSequentialGroup().addGroup(
                        gl.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jbgl3)
                                .addComponent(jbgl4))));
        gl.setVerticalGroup(
                gl.createSequentialGroup().addComponent(jbgl1).addComponent(jbgl2).addComponent(jbgl3)
                        .addComponent(jbgl4));
        // Set the window to be visible as the default to be false
        fgl.add(pgl);
        fgl.pack();
        fgl.setVisible(true);
        fgl.setSize(300, 300);
    }
}
