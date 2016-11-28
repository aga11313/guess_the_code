
package guesscodegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuessCodeGame {
    
    //Create and show the GUI.
	private static void runGUI()
	{
		//Create a new object of class MainMenu
		MainMenu game = new MainMenu();
	}
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
                                //run the GUI method
				runGUI();
			}
		});
    }
    
}
