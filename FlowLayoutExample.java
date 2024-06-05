import java.awt.*;
public class FlowLayoutExample extends Frame{
    FlowLayoutExample(){
        setVisible(true);
        setSize(500,500);
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
        //setLayout(new FlowLayout());
        //setLayout(new FlowLayout(FlowLayout.LEADING));
        setLayout(new FlowLayout(FlowLayout.LEADING,50,25));
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
