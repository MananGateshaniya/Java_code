import java.awt.*;
import java.awt.event.*;

class PopupMenuExample {
    PopupMenuExample() {
        final Frame f = new Frame("PopupMenu Example");
        final PopupMenu popupmenu=new PopupMenu();
        MenuItem java=new MenuItem("java");
        java.setActionCommand("java");
        popupmenu.add(java);

        MenuItem python=new MenuItem("python");
        python.setActionCommand("python");
        popupmenu.add(python);

        MenuItem flutter=new MenuItem("flutter");
        flutter.setActionCommand("flutter");
        popupmenu.add(flutter);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });
        f.add(popupmenu);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new PopupMenuExample();
    }
}