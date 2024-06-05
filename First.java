import java.awt.*;
public class First extends Frame{
    First(){
        Button b=new Button("click me");
        b.setBounds(30,50,50,50);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new First();
    }
}