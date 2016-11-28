
package guesscodegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class popUp implements ActionListener {
    //constant dimensions of a popUp JFrame
    final static int WIDTH = 600;
    final static int HEIGHT = 500;
    //declare all common varibles
    public static Color currentColor;
    JFrame window;
    JLabel title;
    static JPanel contentPane;
     
    //constructo of a popUp object
    public popUp(){
        //create and initializea new JFrame
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        window.setResizable(false);
        //create and initialize a new contentPane
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(currentColor);
        //create and initialize a new label
        title = new JLabel();
        title.setFont(new Font("Calibri", Font.BOLD, 30));
        title.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.add(title);
        
        //add content pane to frame
        window.setContentPane(contentPane);
		
	//size and then display the frame.
        window.pack();
	window.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
