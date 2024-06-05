import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Example1 extends Frame implements ActionListener{
    Button b1,b2,b3;
    Example1(){
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1=new Button("red");
        b2=new Button("green");
        b3=new Button("blue");
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);add(b2);add(b3);
    }
    public void actionPerformed(ActionEvent e){
        //Method 1
        // if (e.getSource()==b1) {
        //     setBackground(Color.red);
        // }else if (e.getSource()==b2) {
        //     setBackground(Color.green);
        // }else if (e.getSource()==b3) {
        //     setBackground(Color.blue);
        // }

        //Method 2
        String s=e.getActionCommand();
        if (s.equals("red")) {
            setBackground(Color.red);
        }else if (s.equals("green")) {
            setBackground(Color.green);
        }else if (s.equals("blue")) {
            setBackground(Color.blue);
        }
    }
    public static void main(String[] args) {
        new Example1();
    }
}
