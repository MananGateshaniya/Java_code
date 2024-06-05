import java.awt.*;
import java.awt.event.*;
public class ListExample extends Frame implements ItemListener{
    List l;
    Label lb;
    ListExample(){
        l=new List(3);
        lb=new Label();
        add(l);
        add(lb);
        l.addItemListener(this);
        l.add("java");
        l.add("python");
        l.add("c++");
        l.add("javascript");
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        l.setBounds(100,100,200,100);
        lb.setSize(200,100);
    }
    public void itemStateChanged(ItemEvent e){
        lb.setText(l.getSelectedItem());
    }
    public static void main(String[] args) {
        new ListExample();
    }
}
