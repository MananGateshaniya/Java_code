import java.awt.*;
import javax.swing.*;
public class gridlayout_ex {
JFrame frameObj, f1, f2;

gridlayout_ex() {
frameObj = new JFrame("simpple grid");

JButton btn1 = new JButton("1");
JButton btn2 = new JButton("2");
JButton btn3 = new JButton("3");
JButton btn4 = new JButton("4");
JButton btn5 = new JButton("5");
JButton btn6 = new JButton("6");
frameObj.add(btn1);
frameObj.add(btn2);
frameObj.add(btn3);
frameObj.add(btn4);

frameObj.add(btn5);
frameObj.add(btn6);
frameObj.setLayout(new GridLayout());
frameObj.setSize(300, 300);
frameObj.setVisible(true);
f1 = new JFrame("buttons set in row and col form ");
JButton b1 = new JButton("1");
JButton b2 = new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);
f1.add(b5);
f1.add(b6);
f1.add(b7);
f1.add(b8);
f1.add(b9);
f1.setLayout(new GridLayout(4, 2));
f1.setSize(300, 300);
f1.setVisible(true);

f2 = new JFrame("with gape between buttons ");
JButton bt1 = new JButton("1");
JButton bt2 = new JButton("2");
JButton bt3 = new JButton("3");
JButton bt4 = new JButton("4");
JButton bt5 = new JButton("5");
JButton bt6 = new JButton("6");
JButton bt7 = new JButton("7");
JButton bt8 = new JButton("8");
JButton bt9 = new JButton("9");
f2.add(bt1);
f2.add(bt2);
f2.add(bt3);
f2.add(bt4);
f2.add(bt5);
f2.add(bt6);
f2.add(bt7);
f2.add(bt8);
f2.add(bt9);

f2.setLayout(new GridLayout(3, 3, 20, 25));
f2.setSize(300, 300);
f2.setVisible(true);
}

public static void main(String argvs[]) {
new gridlayout_ex();
}
}
