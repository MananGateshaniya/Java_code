import java.awt.*;

public class ScrollbarExample1 {

     ScrollbarExample1() {
          Frame f = new Frame("Scrollbar Example");

          Scrollbar s = new Scrollbar();

          s.setBounds(100, 100, 50, 200);

          f.add(s);

          f.setSize(400, 400);
          f.setLayout(null);
          f.setVisible(true);
     }

     public static void main(String args[]) {    
          new ScrollbarExample1();
     }
}
