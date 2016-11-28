
package guesscodegame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class rules extends popUp {
    JLabel picLabel;
    
    public rules() throws IOException{
        super();
        
        title.setText("Rules");
        title.setBounds(250, 20, 500, 50);
        displayRules();
        
        contentPane.add(picLabel);
    }

    public void displayRules() throws IOException{
    
        BufferedImage myPicture = ImageIO.read(new File("rules.jpg"));
        picLabel = new JLabel(new ImageIcon(myPicture));
        
        picLabel.setBounds(50, 100, 500, 300);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
