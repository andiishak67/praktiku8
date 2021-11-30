package main4;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author andiishak
 */
public class Main4 extends JFrame {
public static void main (String[] args){
            Main4  a = new Main4();            
}
  public Main4(){
      GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout (grid);
        setTitle("GridBag Layout Example");
        GridBagLayout layout = new GridBagLayout();
      this.setLayout(layout);
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 0;
      this.add(new Button ("Button 1"),gbc);
      gbc.gridx = 1;
      gbc.gridy = 0;
      this.add(new Button ("Button 2"),gbc);
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.ipady = 20;
      gbc.gridx = 0;
      gbc.gridy = 1;
      this.add(new Button ("Button 3"),gbc);
      gbc.gridx = 1;
      gbc.gridy = 1; 
      this.add(new Button ("Button 4"),gbc);
      gbc.gridx = 0;
      gbc.gridy = 2; 
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridwidth = 2;
      this.add(new Button ("Button 5"),gbc);
        setSize(300, 300);
        setPreferredSize(getSize());
        setVisible (true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
  }  
    }
