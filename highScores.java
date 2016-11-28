
package guesscodegame;

import java.awt.Font;
import javax.swing.JTextArea;

public class highScores extends popUp {
    
    JTextArea players, scores;
    
    public highScores(){
        super();
        title.setText("High Scores");
        title.setBounds(200, 20, 500, 50);
        
        players = new JTextArea("Players scores");
        players.setBounds(100, 100, 150, 250);
        players.setFont(new Font("Calibri", Font.PLAIN, 20));
        players.setEditable(false);
        contentPane.add(players);
        
    }
}
