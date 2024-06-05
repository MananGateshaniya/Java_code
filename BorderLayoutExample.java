import java.awt.*;
//import java.awt.event.*;
public class BorderLayoutExample extends Frame{
    BorderLayoutExample(){
        setVisible(true);
        setSize(500,500);
        BorderLayout bl=new BorderLayout(15,15);
        setLayout(bl);
        Button b1=new Button("North");
        add(b1,BorderLayout.NORTH);
        Button b2=new Button("South");
        add(b2,BorderLayout.SOUTH);
        Button b3=new Button("West");
        add(b3,BorderLayout.WEST);
        Button b4=new Button("East");
        add(b4,BorderLayout.EAST);
        Button b5=new Button("Center");
        add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
