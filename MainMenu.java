
package guesscodegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class MainMenu implements ActionListener {

	static JFrame main; //initialize the main JFrame
	static JPanel contentPane; //initialize teh contentPane
	JLabel title, code; //create 
        //all static buttons initizailed
        public static JButton confirm, defend, guess, changeColor, rules, highScores, A1, B1, 
                C1, D1, A2, B2, C2, D2, A3, B3, C3, D3, A4, B4, C4, D4, A5, B5, C5,
                D5, A6, B6, C6, D6, A7, B7, C7, D7, A8, B8, C8, D8, A9, B9, C9, D9, 
                A10, B10, C10, D10, code1, code2, code3, code4, pA1, pB1, pC1, pD1, 
                pA2, pB2, pC2, pD2, pA3, pB3, pC3, pD3, pA4, pB4, pC4, pD4,
                pA5, pB5, pC5, pD5, pA6, pB6, pC6, pD6, pA7, pB7, pC7, pD7, 
                pA8, pB8, pC8, pD8, pA9, pB9, pC9, pD9, pA10, pB10, pC10, pD10;
        //
        public static JTextArea instruction;
        //button Arrays for storing the code and evaluation buttons
        public static JButton buttonArray[][] = new JButton[4][10];
        public static JButton evaluateButtonArray[][] = new JButton[4][10];
        final static int WIDTH = 900;//the dimensions of the JFrame
        final static int HEIGHT = 650;
        static boolean buttonPress = true;
        static boolean buttonPress2 = true;
        int rows = 0, collumns = 0;
        int rows2 = 0, collumns2 = 0;
        defend newDefendGame = new defend();
        guess newGuessGame = new guess();
        boolean chooseDefend = false, chooseGuess = false;
	
	public MainMenu () 
	{
		//Create and set up the Jframe
		main = new JFrame("Guess The Code Game");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                main.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                main.setResizable(false);
                
		
		//Create a content pane
		contentPane = new JPanel();
                contentPane.setLayout(null);

                    
                //Create the button to open the "Defend" mode of the game
                defend = new JButton("Start Game : Defend");
                defend.setActionCommand("defend");
                defend.addActionListener(this);
                defend.setBackground(Color.WHITE);
                defend.setBounds(10, 10, 200, 50);
                defend.setFont(new Font("Calibri", Font.PLAIN, 20));
                defend.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                contentPane.add(defend);
                
                //Create the button to open the "Guess" mode of the game
                guess = new JButton("Start game : Guess");
                guess.setActionCommand("guess");
                guess.addActionListener(this);
                guess.setBackground(Color.WHITE);
                guess.setBounds(WIDTH-220, 10, 200, 50);
                guess.setFont(new Font("Calibri", Font.PLAIN, 20));
                guess.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                contentPane.add(guess);
		
                //Create and customize the confirm button
                confirm = new JButton("Confirm");
                confirm.setActionCommand("confirm");
                confirm.addActionListener(this);
                confirm.setBounds(400, 370, 400, 60);
                confirm.setBackground(Color.WHITE);
                confirm.setFont(new Font("Calibri", Font.PLAIN, 20));
                confirm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                confirm.setEnabled(false);
                contentPane.add(confirm);
                
                
                //create and customize the title label
                title = new JLabel("Guess The Code Game");
                title.setBounds(270, 10, 400, 50);
                title.setFont(new Font("Calibri", Font.BOLD, 30));
                title.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
                contentPane.add(title);
                
                //creade and customize the code label
                code = new JLabel("Code");
                code.setBounds(100, 500, 400, 50);
                code.setFont(new Font("Calibri", Font.PLAIN, 20));
                code.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
                contentPane.add(code);
                
                //create and cutomize the instructon box
                instruction = new JTextArea("Choose the mode of the game!\nGuess or Defend");
                instruction.setBounds(400, 200, 400, 150);
                instruction.setFont(new Font("Calibri", Font.BOLD, 22));
                instruction.setMargin(( new Insets(10,10,10,10)));
                instruction.setLineWrap(true);
                instruction.setEditable(false);
                contentPane.add(instruction);
                
                //create and customize the "DIsplay rules" button
                rules = new JButton("Display Rules");
                rules.setActionCommand("rules");
                rules.addActionListener(this);
                rules.setBackground(Color.WHITE);
                rules.setBounds(WIDTH-220, HEIGHT-150, 200, 50);
                rules.setFont(new Font("Calibri", Font.PLAIN, 20));
                contentPane.add(rules);
                
                //create and customize the "CHange color" button
                changeColor = new JButton("Change color");
                changeColor.setActionCommand("changeColor");
                changeColor.addActionListener(this);
                changeColor.setBackground(Color.WHITE);
                changeColor.setBounds(WIDTH-220, HEIGHT-90, 200, 50);
                changeColor.setFont(new Font("Calibri", Font.PLAIN, 20));
                contentPane.add(changeColor);
                
                
                //creates and sets up all code buttons from A to D10
                A1 = new JButton(); //creates a button
                setUpButton(A1); //calls a set up method which gives key characteristing to the button
                A1.setActionCommand("A1"); //chhses the button name as its actioncommand
                rows++;
                
                B1 = new JButton();
                setUpButton(B1);
                B1.setActionCommand("B1");
                rows++;
                
                C1 = new JButton();
                setUpButton(C1);
                C1.setActionCommand("C1");
                rows++;
                
                D1 = new JButton();
                setUpButton(D1);
                D1.setActionCommand("D1");
                rows = 0;
                collumns++;
                
                A2 = new JButton();
                setUpButton(A2);
                A2.setActionCommand("A2");
                rows++;
                
                B2 = new JButton();
                setUpButton(B2);
                B2.setActionCommand("B2");
                rows++;
                
                C2 = new JButton();
                setUpButton(C2);
                C2.setActionCommand("C2");
                rows++;
                
                D2 = new JButton();
                setUpButton(D2);
                D2.setActionCommand("D2");
                rows = 0;
                collumns++;
                
                A3 = new JButton();
                setUpButton(A3);
                A3.setActionCommand("A3");
                rows++;
                
                B3 = new JButton();
                setUpButton(B3);
                B3.setActionCommand("B3");
                rows++;
                
                C3 = new JButton();
                setUpButton(C3);
                C3.setActionCommand("C3");
                rows++;
                
                D3 = new JButton();
                setUpButton(D3);
                D3.setActionCommand("D3");
                rows = 0;
                collumns++;
                
                A4 = new JButton();
                setUpButton(A4);
                A4.setActionCommand("A4");
                rows++;
                
                B4 = new JButton();
                setUpButton(B4);
                B4.setActionCommand("B4");
                rows++;
                
                C4 = new JButton();
                setUpButton(C4);
                C4.setActionCommand("C4");
                rows++;
                
                D4 = new JButton();
                setUpButton(D4);
                D4.setActionCommand("D4");
                rows = 0;
                collumns++;
                
                A5 = new JButton();
                setUpButton(A5);
                A5.setActionCommand("A5");
                rows++;
                
                B5 = new JButton();
                setUpButton(B5);
                B5.setActionCommand("B5");
                rows++;
                
                C5 = new JButton();
                setUpButton(C5);
                C5.setActionCommand("C5");
                rows++;
                
                D5 = new JButton();
                setUpButton(D5);
                D5.setActionCommand("D5");
                rows = 0;
                collumns++;
                
                A6 = new JButton();
                setUpButton(A6);
                A6.setActionCommand("A6");
                rows++;
                
                B6 = new JButton();
                setUpButton(B6);
                B6.setActionCommand("B6");
                rows++;
                
                C6 = new JButton();
                setUpButton(C6);
                C6.setActionCommand("C6");
                rows++;
                
                D6 = new JButton();
                setUpButton(D6);
                D6.setActionCommand("D6");
                rows = 0;
                collumns++;
                
                A7 = new JButton();
                setUpButton(A7);
                A7.setActionCommand("A7");
                rows++;
                
                B7 = new JButton();
                setUpButton(B7);
                B7.setActionCommand("B7");
                rows++;
                
                C7 = new JButton();
                setUpButton(C7);
                C7.setActionCommand("C7");
                rows++;
                
                D7 = new JButton();
                setUpButton(D7);
                D7.setActionCommand("D7");
                rows = 0;
                collumns++;
                
                A8 = new JButton();
                setUpButton(A8);
                A8.setActionCommand("A8");
                rows++;
                
                B8 = new JButton();
                setUpButton(B8);
                B8.setActionCommand("B8");
                rows++;
                
                C8 = new JButton();
                setUpButton(C8);
                C8.setActionCommand("C8");
                rows++;
                
                D8 = new JButton();
                setUpButton(D8);
                D8.setActionCommand("D8");
                rows = 0;
                collumns++;
                
                A9 = new JButton();
                setUpButton(A9);
                A9.setActionCommand("A9");
                rows++;
                
                B9 = new JButton();
                setUpButton(B9);
                B9.setActionCommand("B9");
                rows++;
                
                C9 = new JButton();
                setUpButton(C9);
                C9.setActionCommand("C9");
                rows++;
                
                D9 = new JButton();
                setUpButton(D9);
                D9.setActionCommand("D9");
                rows = 0;
                collumns++;
                
                A10 = new JButton();
                setUpButton(A10);
                A10.setActionCommand("A10");
                rows++;
                
                B10 = new JButton();
                setUpButton(B10);
                B10.setActionCommand("B10");
                rows++;
                
                C10 = new JButton();
                setUpButton(C10);
                C10.setActionCommand("C10");
                rows++;
                
                D10 = new JButton();
                setUpButton(D10);
                D10.setActionCommand("D10");
                
                //place 40 code buttons equaly spaced in the GUI
                for(int i=0; i<4; i++){
                    for (int j=0; j<10 ; j++){
                        //a point of (100, 100) is the staring point of placing buttons
                        buttonArray[i][j].setBounds(100 + i*40, 100 + j*40, 30, 30);
                    }
                
                }
                
                //create and customize the combination buttons
                code1 = new JButton();
                code1.setBackground(Color.WHITE);
                code1.setEnabled(false);
                code1.setActionCommand("code1");
                code1.setBounds(100, 550, 30, 30);
                code1.addActionListener(this);
                contentPane.add(code1);
                
                code2 = new JButton();
                code2.setBackground(Color.WHITE);
                code2.setEnabled(false);
                code2.setActionCommand("code2");
                code2.setBounds(140, 550, 30, 30);
                code2.addActionListener(this);
                contentPane.add(code2);
                
                code3 = new JButton();
                code3.setBackground(Color.WHITE);
                code3.setEnabled(false);
                code3.setActionCommand("code3");
                code3.setBounds(180, 550, 30, 30);
                code3.addActionListener(this);
                contentPane.add(code3);
                
                code4 = new JButton();
                code4.setBackground(Color.WHITE);
                code4.setEnabled(false);
                code4.setActionCommand("code4");
                code4.setBounds(220, 550, 30, 30);
                code4.addActionListener(this);
                contentPane.add(code4);
                
                //create and cumstomise the Evaluation buttons
                pA1 = new JButton("pA1");
                setUpButton2(pA1);
                rows2++;
                
                pB1 = new JButton("pB1");
                setUpButton2(pB1);
                rows2++;
                
                pC1 = new JButton("pC1");
                setUpButton2(pC1);
                rows2++;
                
                pD1 = new JButton("pD1");
                setUpButton2(pD1);
                rows2 = 0;
                collumns2++;
                
                pA2 = new JButton("pA2");
                setUpButton2(pA2);
                rows2++;
                
                pB2 = new JButton("pB2");
                setUpButton2(pB2);
                rows2++;
                
                pC2 = new JButton("pC2");
                setUpButton2(pC2);
                rows2++;
                
                pD2 = new JButton("pD2");
                setUpButton2(pD2);
                rows2 = 0;
                collumns2++;
                
                pA3 = new JButton("pA3");
                setUpButton2(pA3);
                rows2++;
                
                pB3 = new JButton("pB3");
                setUpButton2(pB3);
                rows2++;
                
                pC3 = new JButton("pC3");
                setUpButton2(pC3);
                rows2++;
                
                pD3 = new JButton("pD3");
                setUpButton2(pD3);
                rows2 = 0;
                collumns2++;
                
                pA4 = new JButton("pA4");
                setUpButton2(pA4);
                rows2++;
                
                pB4 = new JButton("pB4");
                setUpButton2(pB4);
                rows2++;
                
                pC4 = new JButton("pC4");
                setUpButton2(pC4);
                rows2++;
                
                pD4 = new JButton("pD4");
                setUpButton2(pD4);
                rows2 = 0;
                collumns2++;
                
                pA5 = new JButton("pA5");
                setUpButton2(pA5);
                rows2++;
                
                pB5 = new JButton("pB5");
                setUpButton2(pB5);
                rows2++;
                
                pC5 = new JButton("pC5");
                setUpButton2(pC5);
                rows2++;
                
                pD5 = new JButton("pD5");
                setUpButton2(pD5);
                rows2 = 0;
                collumns2++;
                
                pA6 = new JButton("pA6");
                setUpButton2(pA6);
                rows2++;
                
                pB6 = new JButton("pB6");
                setUpButton2(pB6);
                rows2++;
                
                pC6 = new JButton("pC6");
                setUpButton2(pC6);
                rows2++;
                
                pD6 = new JButton("pD6");
                setUpButton2(pD6);
                rows2 = 0;
                collumns2++;
                
                pA7 = new JButton("pA7");
                setUpButton2(pA7);
                rows2++;
                
                pB7 = new JButton("pB7");
                setUpButton2(pB7);
                rows2++;
                
                pC7 = new JButton("pC7");
                setUpButton2(pC7);
                rows2++;
                
                pD7 = new JButton("pD7");
                setUpButton2(pD7);
                rows2 = 0;
                collumns2++;
                
                pA8 = new JButton("pA8");
                setUpButton2(pA8);
                rows2++;
                
                pB8 = new JButton("pB8");
                setUpButton2(pB8);
                rows2++;
                
                pC8 = new JButton("pC8");
                setUpButton2(pC8);
                rows2++;
                
                pD8 = new JButton("pD8");
                setUpButton2(pD8);
                rows2 = 0;
                collumns2++;
                
                pA9 = new JButton("pA9");
                setUpButton2(pA9);
                rows2++;
                
                pB9 = new JButton("pB9");
                setUpButton2(pB9);
                rows2++;
                
                pC9 = new JButton("pC9");
                setUpButton2(pC9);
                rows2++;
                
                pD9 = new JButton("pD9");
                setUpButton2(pD9);
                rows2 = 0;
                collumns2++;
                
                pA10 = new JButton("pA10");
                setUpButton2(pA10);
                rows2++;
                
                pB10 = new JButton("pB10");
                setUpButton2(pB10);
                rows2++;
                
                pC10 = new JButton("pC10");
                setUpButton2(pC10);
                rows2++;
                
                
                pD10 = new JButton("pD10");
                setUpButton2(pD10);
                
                
                //place 40 evaluation buttons equally spaced in the contentPane
                for(int i=0; i<2; i++){
                    for (int j=0; j<10 ; j++){
                        evaluateButtonArray[i][j].setBounds(270 + i*20, 100 + j*40, 10, 10);
                    
                    }
                
                }
                for (int i = 2; i<4; i++){
                
                    for (int j=0; j<10 ; j++){
                        evaluateButtonArray[i][j].setBounds(270 + (i-2)*20, 120 + j*40, 10, 10);
                    
                    }
                
                }
                
                
		//Add content pane to frame
		main.setContentPane(contentPane);
		
		//Size and then display the frame.
		main.pack();
		main.setVisible(true);
	}
    
    //creates and cutomizes an input button
    //Pre condition: none
    //Post condition: a button 
        
    public void setUpButton(JButton b){
                
                //customizes an input code button b
                b.setBackground(Color.WHITE); //set backgorund of button b to white
                b.addActionListener(this); //create action Listener
                buttonArray[rows][collumns] = b; //adds a button to the array of buttons
                b.setEnabled(false); //disabled the editability of the button
                contentPane.add(b); //adds the button to the content pane
    
    }
    
    //creates and cutomizes an input button
    //Pre condition: none
    //Post condition: a button 
    public void setUpButton2(JButton b){
            
            //customizes an input ebaluation button b
            b.setBackground(Color.WHITE);
            //b.setActionCommand(b.getName());
            b.addActionListener(this);
            evaluateButtonArray[rows2][collumns2] = b;
            b.setEnabled(false);
            contentPane.add(b);
        
    }
    
    //creates and cutomizes an input button
    //Pre condition: none
    //Post condition: a button 
    public void buttonClick(JButton b){
        //describes the color changes when a code button is clicked
        //if(buttonPress == true){
            if (b.getBackground() == Color.WHITE){
                b.setBackground(Color.BLACK);
            } else if (b.getBackground() == Color.BLACK){
                b.setBackground(Color.GREEN);
            } else if (b.getBackground() == Color.GREEN){
                b.setBackground(Color.BLUE);
            } else if (b.getBackground() == Color.BLUE){
                b.setBackground(Color.YELLOW);
            } else if (b.getBackground() == Color.YELLOW){
                b.setBackground(Color.ORANGE);
            } else if (b.getBackground() == Color.ORANGE){
                b.setBackground(Color.RED);
            } else if (b.getBackground() == Color.RED){
                b.setBackground(Color.WHITE);
            }
        //}
    }
    
    //creates and cutomizes an input button
    //Pre condition: none
    //Post condition: a button 
    public void buttonClick2(javax.swing.JButton b){
        //describes the color changes when an evaluation button is clicked
        //if (buttonPress2 == true){
            if (b.getBackground() == Color.WHITE){
                b.setBackground(Color.BLACK);
            } else if (b.getBackground() == Color.BLACK){
                b.setBackground(Color.RED);
            } else if (b.getBackground() == Color.RED){
                b.setBackground(Color.WHITE);
            }
        //}
    
    }
    
    
        
    @Override
    public void actionPerformed(ActionEvent event) {
        
        String eventName = event.getActionCommand();
        
        
        
        if (eventName.equals("A1")){
            //call a method when a button is clicked
            buttonClick(A1);    
        } else if (eventName.equals("B1")){
            buttonClick(B1);
        } else if (eventName.equals("C1")){
            buttonClick(C1);
        } else if (eventName.equals("D1")){
            buttonClick(D1);
        } else if (eventName.equals("A2")){
            buttonClick(A2);    
        } else if (eventName.equals("B2")){
            buttonClick(B2);
        } else if (eventName.equals("C2")){
            buttonClick(C2);
        } else if (eventName.equals("D2")){
            buttonClick(D2);
        } else if (eventName.equals("A3")){
            buttonClick(A3);    
        } else if (eventName.equals("B3")){
            buttonClick(B3);
        } else if (eventName.equals("C3")){
            buttonClick(C3);
        } else if (eventName.equals("D3")){
            buttonClick(D3);
        } else if (eventName.equals("A4")){
            buttonClick(A4);    
        } else if (eventName.equals("B4")){
            buttonClick(B4);
        } else if (eventName.equals("C4")){
            buttonClick(C4);
        } else if (eventName.equals("D4")){
            buttonClick(D4);
        } else if (eventName.equals("A5")){
            buttonClick(A5);    
        } else if (eventName.equals("B5")){
            buttonClick(B5);
        } else if (eventName.equals("C5")){
            buttonClick(C5);
        } else if (eventName.equals("D5")){
            buttonClick(D5);
        } else if (eventName.equals("A6")){
            buttonClick(A6);    
        } else if (eventName.equals("B6")){
            buttonClick(B6);
        } else if (eventName.equals("C6")){
            buttonClick(C6);
        } else if (eventName.equals("D6")){
            buttonClick(D6);
        } else if (eventName.equals("A7")){
            buttonClick(A7);    
        } else if (eventName.equals("B7")){
            buttonClick(B7);
        } else if (eventName.equals("C7")){
            buttonClick(C7);
        } else if (eventName.equals("D7")){
            buttonClick(D7);
        } else if (eventName.equals("A8")){
            buttonClick(A8);    
        } else if (eventName.equals("B8")){
            buttonClick(B8);
        } else if (eventName.equals("C8")){
            buttonClick(C8);
        } else if (eventName.equals("D8")){
            buttonClick(D8);
        } else if (eventName.equals("A9")){
            buttonClick(A9);    
        } else if (eventName.equals("B9")){
            buttonClick(B9);
        } else if (eventName.equals("C9")){
            buttonClick(C9);
        } else if (eventName.equals("D9")){
            buttonClick(D9);
        } else if (eventName.equals("A10")){
            buttonClick(A10);    
        } else if (eventName.equals("B10")){
            buttonClick(B10);
        } else if (eventName.equals("C10")){
            buttonClick(C10);
        } else if (eventName.equals("D10")){
            buttonClick(D10);
        } else if (eventName.equals("pA1")){
            buttonClick2(pA1);    
        } else if (eventName.equals("pB1")){
            buttonClick2(pB1);
        } else if (eventName.equals("pC1")){
            buttonClick2(pC1);
        } else if (eventName.equals("pD1")){
            buttonClick2(pD1);
        } else if (eventName.equals("pA2")){
            buttonClick2(pA2);    
        } else if (eventName.equals("pB2")){
            buttonClick2(pB2);
        } else if (eventName.equals("pC2")){
            buttonClick2(pC2);
        } else if (eventName.equals("pD2")){
            buttonClick2(pD2);
        } else if (eventName.equals("pA3")){
            buttonClick2(pA3);    
        } else if (eventName.equals("pB3")){
            buttonClick2(pB3);
        } else if (eventName.equals("pC3")){
            buttonClick2(pC3);
        } else if (eventName.equals("pD3")){
            buttonClick2(pD3);
        } else if (eventName.equals("pA4")){
            buttonClick2(pA4);    
        } else if (eventName.equals("pB4")){
            buttonClick2(pB4);
        } else if (eventName.equals("pC4")){
            buttonClick2(pC4);
        } else if (eventName.equals("pD4")){
            buttonClick2(pD4);
        } else if (eventName.equals("pA5")){
            buttonClick2(pA5);    
        } else if (eventName.equals("pB5")){
            buttonClick2(pB5);
        } else if (eventName.equals("pC5")){
            buttonClick2(pC5);
        } else if (eventName.equals("pD5")){
            buttonClick2(pD5);
        } else if (eventName.equals("pA6")){
            buttonClick2(pA6);    
        } else if (eventName.equals("pB6")){
            buttonClick2(pB6);
        } else if (eventName.equals("pC6")){
            buttonClick2(pC6);
        } else if (eventName.equals("pD6")){
            buttonClick2(pD6);
        } else if (eventName.equals("pA7")){
            buttonClick2(pA7);    
        } else if (eventName.equals("pB7")){
            buttonClick2(pB7);
        } else if (eventName.equals("pC7")){
            buttonClick2(pC7);
        } else if (eventName.equals("pD7")){
            buttonClick2(pD7);
        } else if (eventName.equals("pA8")){
            buttonClick2(pA8);    
        } else if (eventName.equals("pB8")){
            buttonClick2(pB8);
        } else if (eventName.equals("pC8")){
            buttonClick2(pC8);
        } else if (eventName.equals("pD8")){
            buttonClick2(pD8);
        } else if (eventName.equals("pA9")){
            buttonClick2(pA9);    
        } else if (eventName.equals("pB9")){
            buttonClick2(pB9);
        } else if (eventName.equals("pC9")){
            buttonClick2(pC9);
        } else if (eventName.equals("pD9")){
            buttonClick2(pD9);
        } else if (eventName.equals("pA10")){
            buttonClick2(pA10);    
        } else if (eventName.equals("pB10")){
            buttonClick2(pB10);
        } else if (eventName.equals("pC10")){
            buttonClick2(pC10);
        } else if (eventName.equals("pD10")){
            buttonClick2(pD10);
        } else if (eventName.equals("code1")){
            buttonClick(code1);    
        } else if (eventName.equals("code2")){
            buttonClick(code2);
        } else if (eventName.equals("code3")){
            buttonClick(code3);
        } else if (eventName.equals("code4")){
            buttonClick(code4);
        } else if (eventName.equals("changeColor")){
            //creates a new object of class background when button is clicked
            background colorWindow = new background();
            
        } else if (eventName.equals("defend")){
            
            newDefendGame.start(); //call a method to start the game
            confirm.setEnabled(true); //enables the confirm button
            chooseDefend = true; //indicated that a defend mode was entered
            
        } else if (eventName.equals("confirm")){
            
            //determines which mode of game is played and calls an appropriate method
            if(chooseDefend == true){
                newDefendGame.confirm();
            } else if (chooseGuess == true){
                newGuessGame.confirm();
            }
            
            
            
        } else if (eventName.equals("rules")){
            
            try {
                rules rulesWindow = new rules();//new object of class rules
            } catch (IOException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (eventName.equals("guess")){
            
            //starts the guess game mode
            newGuessGame.start();//call the start method in class guess
            buttonPress = true;//enable 
            buttonPress2 = false;
            confirm.setEnabled(true);
            chooseGuess = true;
            
        }
    }
    
    
    
}
