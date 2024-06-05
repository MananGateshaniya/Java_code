import javax.swing.*;
public class PasswordExample {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        
        JPasswordField p=new JPasswordField();
        p.setBounds(100,100,100,30);
        // JLabel l=new JLabel("password");
        // l.setBounds(20,100,80,30);
        //f.add(l);
        f.add(p);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,300);
    }
}
