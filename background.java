
package guesscodegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class background extends popUp {
    JButton Blue, Green, Orange;
    
    
    public background(){
        super();
        title.setText("Change Backgound Color");
        title.setBounds(100, 10, 500, 50);
        
        Blue = new JButton("Blue");
        Blue.setActionCommand("Blue");
        Blue.addActionListener(this);
        Blue.setBackground(Color.WHITE);
        Blue.setBounds(200, 150, 200, 60);
        Blue.setFont(new Font("Calibri", Font.PLAIN, 20));
        Blue.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.add(Blue);
                
                Green = new JButton("Green");
                Green.setActionCommand("Green");
                Green.addActionListener(this);
                Green.setBackground(Color.WHITE);
                Green.setBounds(200, 250, 200, 60);
                Green.setFont(new Font("Calibri", Font.PLAIN, 20));
                Green.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                contentPane.add(Green);
                
                Orange = new JButton("Orange");
                Orange.setActionCommand("Orange");
                Orange.addActionListener(this);
                Orange.setBackground(Color.WHITE);
                Orange.setBounds(200, 350, 200, 60);
                Orange.setFont(new Font("Calibri", Font.PLAIN, 20));
                Orange.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                contentPane.add(Orange);
        
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        
        String eventName = event.getActionCommand();
        
            if (eventName.equals("Green")){
                changeToGreen();
            } else if (eventName.equals("Blue")){
                changeToBlue();
            } else if (eventName.equals("Orange")){
                changeToOrange();
            }
        }
    
    public void changeToGreen (){
    
        Color c = new Color(156,226,153);
        contentPane.setBackground(c);
        MainMenu.contentPane.setBackground(c);
        rules.contentPane.setBackground(c);
        highScores.contentPane.setBackground(c);
        currentColor = c;
    }
    
    public void changeToBlue (){
    
        Color c = new Color(183,191,249);
        contentPane.setBackground(c);
        MainMenu.contentPane.setBackground(c);
        rules.contentPane.setBackground(c);
        highScores.contentPane.setBackground(c);
        currentColor = c;
    
    }
    
    public void changeToOrange (){
    
        Color c = new Color(254,168,110);
        contentPane.setBackground(c);
        MainMenu.contentPane.setBackground(c);
        rules.contentPane.setBackground(c);
        highScores.contentPane.setBackground(c);
        currentColor = c;
    
    }
    
}
