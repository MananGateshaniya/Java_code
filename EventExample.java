import java.awt.*;
import java.awt.event.*;
public class EventExample extends Frame implements ActionListener{
    TextField a;
    TextField b1;
    TextField c;
    TextField tf,tf1;
    Panel p;
    EventExample(){
        setBounds(20, 20, 500,500);
        setLayout(null);
        setVisible(true);
        Button b=new Button("add");
        b.setBackground(Color.blue);
        b.setBounds(100,100,100,100);
        b.addActionListener(this);
        tf=new TextField();
        tf.setBounds(80,80,100,50);
        tf.setBackground(Color.GRAY);
        tf1=new TextField();
        tf1.setBackground(Color.GRAY);
        tf1.setBounds(100,50,100,50);
        p=new Panel();
        p.setBounds(50,50,50, 30);
        p.setBackground(Color.GREEN);
        a=tf;
        b1=tf1;
        add(p);
        add(b);
        add(tf);
        add(tf1);
    }
    public void actionPerformed(ActionEvent ae){
        tf.setText("manan");

    }
    public static void main(String[] args) {
        new EventExample();
    }
}
