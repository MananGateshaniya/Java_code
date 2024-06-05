import javax.swing.*;
import javax.swing.event.*;
public class SpinnerExample{
    public static void main(String[] args) {
        JFrame jf=new JFrame("Spinner example");
        JLabel l=new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(250, 100,250,100);
        //JSpinner js=new JSpinner();
        SpinnerModel value = new SpinnerNumberModel(5,0,10, 1);
        JSpinner js=new JSpinner(value);
        js.setBounds(100,100,50,30);
        jf.add(js);
        jf.add(l);
        
        js.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e){
                l.setText("value is:- "+((JSpinner) e.getSource()).getValue());
            }
        });
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setSize(300,300);
    }
}
