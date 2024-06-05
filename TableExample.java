import javax.swing.*;
public class TableExample {
    JFrame f;
    TableExample(){
        f=new JFrame();
        String data[][]={{"1","manan","ahmedabad"},
            {"2","narendra","surat"},
            {"3","rushi","rajkot"}};
        String column[]={"id","name","city"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane jp=new JScrollPane(jt);
        f.add(jp);
        f.setVisible(true);
        f.setSize(400,400);
        //f.setLayout(null);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
