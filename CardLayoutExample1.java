import java.awt.*;
import java.awt.event.*;
import java.awt.CardLayout;
public class CardLayoutExample1 extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    CardLayout c;
    CardLayoutExample1(){
        setVisible(true);
        setSize(500,500);
        //c=new CardLayout();
        c=new CardLayout(30,40);
        setLayout(c);
        b1=new Button("red");
        b2=new Button("green");
        b3=new Button("blue");
        b4=new Button("yellow");
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        b4.setBackground(Color.yellow);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1);add(b2);add(b3);add(b4);
    }
    public void actionPerformed(ActionEvent e){
        c.show(this,"blue");
    }
    public static void main(String[] args) {
        new CardLayoutExample1();
    }
    
}
