import java.awt.*;
public class GridLayoutExample extends Frame{
    GridLayoutExample(){
        setVisible(true);
        setTitle("GridLayoutExample");
        setSize(500,500);
        // setLayout(new GridLayout());
        //setLayout(new GridLayout(2,3));
        setLayout(new GridLayout(2,3,5,5));
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
