import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class ToggleButton extends JFrame implements ItemListener{
    private JToggleButton b;
    ToggleButton(){
        setLayout(new FlowLayout());
        b=new JToggleButton();
        add(b);
        b.addItemListener(this);
        setVisible(true);
        setSize(300,300);
    }
    public void itemStateChanged(ItemEvent e){
        if (b.isSelected()==true) {
            b.setText("off");
        }else{
            b.setText("on");
        }
    }
    public static void main(String[] args) {
        new ToggleButton();
    }
}
