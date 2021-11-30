package main2;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

/**
 *
 * @andiishak
 */
public class Main2 extends JFrame {

    /**
     * @param args the command line arguments
     */
public Main2 (){
    FlowLayout flowlayout = new FlowLayout (FlowLayout.CENTER, 5,10);
        
        //Memperoleh konten panel dari frame
        Container container = getContentPane();
        
        //Mengatur layout manager dari content pane
        container.setLayout(flowlayout);
        
        //Menambahkan lima butotn ke content pane
        container.add(new JButton ("Tombol 1"));
        container.add(new JButton ("Tombol 2"));
        container.add(new JButton ("Tombol 3"));
        container.add(new JButton ("Tombol 4"));
        container.add(new JButton ("Tombol 5"));
    }
    
        public static void main(String[] args) {
            Main2 jendela = new Main2 ();
           jendela.setTitle ("Kelas Demo Flow Layout");
           jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jendela.setSize(390, 120);
           jendela.setVisible(true);
        
       
    }

}
