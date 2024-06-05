import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample implements ItemListener {
    CheckboxGroup group;
    Checkbox checkBox1, checkBox2;
    Label label;
    ItemListenerExample() {
        Frame f = new Frame("CheckBox Example");
        group = new CheckboxGroup();
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        checkBox1 = new Checkbox("C++",group,false);
        checkBox1.setBounds(100, 100, 50, 50);
        checkBox2 = new Checkbox("Java",group,false);
        checkBox2.setBounds(100, 150, 50, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(label);
        
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkBox1)
            label.setText("C++ Checkbox: ");
        if (e.getSource() == checkBox2)
            label.setText("Java Checkbox: ");
    }

    public static void main(String args[]) {
        new ItemListenerExample();
    }
}