package main3;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
/**
 *
 * @author andiishak
 */
public class Main3 extends JFrame {
    JButton yoga = new JButton ("yoga");
    JButton eca = new JButton ("eca");
    JButton yassir = new JButton ("yassir");
    JButton jannuar = new JButton ("Jannuar");
    JButton gusion = new JButton ("gusion");
    JButton lesley = new JButton ("lesley");
    JButton balmond = new JButton ("balmond");
    JButton valir = new JButton ("valir");
    JButton vale = new JButton ("vale");
public Main3 (){
    super ("Grid LAyout Beraksi");
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel pane = new JPanel ();
        GridLayout family = new GridLayout (1,3,10,10);
        pane.setLayout (family);
        pane.add(yoga); pane.add(lesley);
        pane.add(eca); pane.add(balmond);
        pane.add(yassir); pane.add(valir);
        pane.add(jannuar); pane.add(vale);
        pane.add(gusion); 
        add(pane);
        setVisible(true);
}
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Main3 frame= new Main3();
    }
    

}
