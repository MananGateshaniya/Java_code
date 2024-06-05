import javax.swing.*;
import javax.swing.filechooser.FileSystemView;  
public class FileChooserExample
{  
public static void main(String[] args) {  
        JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView()); 
        jf.showSaveDialog(null);  
    }  
}
