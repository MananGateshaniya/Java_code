import java.awt.*;
import java.awt.event.*;
public class Example2 extends Frame implements ItemListener,ActionListener{
    Button b1,b2,b3;
    Label l;
    TextField tf;
    Choice c;
    Example2(){
        b1=new Button("add");
        b2=new Button("remove");
        b3=new Button("removeall");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b1.setBounds(50,150,100,30);
        b2.setBounds(200,150,100,30);
        b3.setBounds(350,150,100,30);
        add(b1);add(b2);add(b3);
        l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        add(l);
        c=new Choice();
        c.setBounds(200,220,100,75);
        add(c);
        tf=new TextField();
        tf.setBounds(200,100,170,30);
        add(tf);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
    }
    public void itemStateChanged(ItemEvent e){
        l.setText("selected item "+c.getSelectedItem());
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1) {
            String s=tf.getText();
            c.add(s);
            l.setText("item added"+tf.getText());
        }
        if (e.getSource()==b2) {
            l.setText("remove item "+c.getSelectedItem());
            c.remove(c.getSelectedItem());            
        }
        if (e.getSource()==b3) {
            c.removeAll();
            l.setText("all item removed from choice");
        }
    }
    
    public static void main(String[] args) {
        new Example2();
    }
}
