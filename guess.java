
package guesscodegame;

import java.awt.Color;
import javax.swing.JButton;



public class guess extends game {
    
    public guess(){
        super();
    }
    
    public void start(){
        MainMenu.buttonPress = true;
        setArray(); //set the Array of all combinations
        //MainMenu.buttonPress2 = false;
        //choose a rondom code as a combinationToGuess
        code c = new code();
        c.setCode(random()[0], random()[1], random()[2], random()[3]);
        combinationToGuess = c;
        //disable the start game buttons and enable a respective row of code buttons
        MainMenu.defend.setEnabled(false);
        MainMenu.guess.setEnabled(false);
        MainMenu.A1.setEnabled(true);
        MainMenu.B1.setEnabled(true);
        MainMenu.C1.setEnabled(true);
        MainMenu.D1.setEnabled(true);
        MainMenu.pA1.setEnabled(true);
        MainMenu.pB1.setEnabled(true);
        MainMenu.pC1.setEnabled(true);
        MainMenu.pD1.setEnabled(true);
        //display instruction on the creen
        MainMenu.instruction.setText("Computer chose the code\nMake your 1st guess and confirm it!");
        
    }
    
    public void confirm(){
        if (counter == 1){
            MainMenu.instruction.setText("Your 1st Guess was evaluated\n Guess again!");
            //disable and enable respective buttons
            MainMenu.A1.setEnabled(false);
            MainMenu.B1.setEnabled(false);
            MainMenu.C1.setEnabled(false);
            MainMenu.D1.setEnabled(false);
            MainMenu.A2.setEnabled(true);
            MainMenu.B2.setEnabled(true);
            MainMenu.B2.setEnabled(true);
            MainMenu.C2.setEnabled(true);
            MainMenu.D2.setEnabled(true);
            MainMenu.pA2.setEnabled(true);
            MainMenu.pB2.setEnabled(true);
            MainMenu.pC2.setEnabled(true);
            MainMenu.pD2.setEnabled(true);
            //input the guess form the user and save it as last guess
            code l = new code();
            l.setCode(MainMenu.A1.getBackground(), MainMenu.B1.getBackground(), 
                    MainMenu.C1.getBackground(), MainMenu.D1.getBackground());
            lastGuess = l;
            //check if the guess input is equal to the combinationToGuess
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) 
                    && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) 
                    && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            }
            generateEvaluation2();//generate evaluation for the users guess
            //display it to the screen
            displayEvaluation(MainMenu.pA1, MainMenu.pB1, MainMenu.pC1, MainMenu.pD1);
            
        } else if( counter == 2){
            MainMenu.instruction.setText("Your 2nd Guess was evaluated\n Guess again!");
            MainMenu.A2.setEnabled(false);
            MainMenu.B2.setEnabled(false);
            MainMenu.C2.setEnabled(false);
            MainMenu.D2.setEnabled(false);
            MainMenu.A3.setEnabled(true);
            MainMenu.B3.setEnabled(true);
            MainMenu.B3.setEnabled(true);
            MainMenu.C3.setEnabled(true);
            MainMenu.D3.setEnabled(true);
            MainMenu.pA3.setEnabled(true);
            MainMenu.pB3.setEnabled(true);
            MainMenu.pC3.setEnabled(true);
            MainMenu.pD3.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A2.getBackground(), MainMenu.B2.getBackground(), MainMenu.C2.getBackground(), MainMenu.D2.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA2, MainMenu.pB2, MainMenu.pC2, MainMenu.pD2);
            
        } else if( counter == 3){
            MainMenu.instruction.setText("Your 3rd Guess was evaluated\n Guess again!");
            MainMenu.A3.setEnabled(false);
            MainMenu.B3.setEnabled(false);
            MainMenu.C3.setEnabled(false);
            MainMenu.D3.setEnabled(false);
            MainMenu.A4.setEnabled(true);
            MainMenu.B4.setEnabled(true);
            MainMenu.B4.setEnabled(true);
            MainMenu.C4.setEnabled(true);
            MainMenu.D4.setEnabled(true);
            MainMenu.pA4.setEnabled(true);
            MainMenu.pB4.setEnabled(true);
            MainMenu.pC4.setEnabled(true);
            MainMenu.pD4.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A3.getBackground(), MainMenu.B3.getBackground(), MainMenu.C3.getBackground(), MainMenu.D3.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA3, MainMenu.pB3, MainMenu.pC3, MainMenu.pD3);
            
        } else if( counter == 4){
            MainMenu.instruction.setText("Your 4th Guess was evaluated\n Guess again!");
            MainMenu.A4.setEnabled(false);
            MainMenu.B4.setEnabled(false);
            MainMenu.C4.setEnabled(false);
            MainMenu.D4.setEnabled(false);
            MainMenu.A5.setEnabled(true);
            MainMenu.B5.setEnabled(true);
            MainMenu.B5.setEnabled(true);
            MainMenu.C5.setEnabled(true);
            MainMenu.D5.setEnabled(true);
            MainMenu.pA5.setEnabled(true);
            MainMenu.pB5.setEnabled(true);
            MainMenu.pC5.setEnabled(true);
            MainMenu.pD5.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A4.getBackground(), MainMenu.B4.getBackground(), MainMenu.C4.getBackground(), MainMenu.D4.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA4, MainMenu.pB4, MainMenu.pC4, MainMenu.pD4);
            
        } else if( counter == 5){
            MainMenu.instruction.setText("Your 5th Guess was evaluated\n Guess again!");
            MainMenu.A5.setEnabled(false);
            MainMenu.B5.setEnabled(false);
            MainMenu.C5.setEnabled(false);
            MainMenu.D5.setEnabled(false);
            MainMenu.A6.setEnabled(true);
            MainMenu.B6.setEnabled(true);
            MainMenu.B6.setEnabled(true);
            MainMenu.C6.setEnabled(true);
            MainMenu.D6.setEnabled(true);
            MainMenu.pA6.setEnabled(true);
            MainMenu.pB6.setEnabled(true);
            MainMenu.pC6.setEnabled(true);
            MainMenu.pD6.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A5.getBackground(), MainMenu.B5.getBackground(), MainMenu.C5.getBackground(), MainMenu.D5.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA5, MainMenu.pB5, MainMenu.pC5, MainMenu.pD5);
            
        } else if( counter == 6){
            MainMenu.instruction.setText("Your 6th Guess was evaluated\n Guess again!");
            MainMenu.A6.setEnabled(false);
            MainMenu.B6.setEnabled(false);
            MainMenu.C6.setEnabled(false);
            MainMenu.D6.setEnabled(false);
            MainMenu.A7.setEnabled(true);
            MainMenu.B7.setEnabled(true);
            MainMenu.B7.setEnabled(true);
            MainMenu.C7.setEnabled(true);
            MainMenu.D7.setEnabled(true);
            MainMenu.pA7.setEnabled(true);
            MainMenu.pB7.setEnabled(true);
            MainMenu.pC7.setEnabled(true);
            MainMenu.pD7.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A6.getBackground(), MainMenu.B6.getBackground(), MainMenu.C6.getBackground(), MainMenu.D6.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA6, MainMenu.pB6, MainMenu.pC6, MainMenu.pD6);
            
        
        } else if( counter == 7){
            MainMenu.instruction.setText("Your 7th Guess was evaluated\n Guess again!");
            MainMenu.A7.setEnabled(false);
            MainMenu.B7.setEnabled(false);
            MainMenu.C7.setEnabled(false);
            MainMenu.D7.setEnabled(false);
            MainMenu.A8.setEnabled(true);
            MainMenu.B8.setEnabled(true);
            MainMenu.B8.setEnabled(true);
            MainMenu.C8.setEnabled(true);
            MainMenu.D8.setEnabled(true);
            MainMenu.pA8.setEnabled(true);
            MainMenu.pB8.setEnabled(true);
            MainMenu.pC8.setEnabled(true);
            MainMenu.pD8.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A7.getBackground(), MainMenu.B7.getBackground(), MainMenu.C7.getBackground(), MainMenu.D7.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA7, MainMenu.pB7, MainMenu.pC7, MainMenu.pD7);
            
        } else if( counter == 8){
            MainMenu.instruction.setText("Your 8th Guess was evaluated\n Guess again!");
            MainMenu.A8.setEnabled(false);
            MainMenu.B8.setEnabled(false);
            MainMenu.C8.setEnabled(false);
            MainMenu.D8.setEnabled(false);
            MainMenu.A9.setEnabled(true);
            MainMenu.B9.setEnabled(true);
            MainMenu.B9.setEnabled(true);
            MainMenu.C9.setEnabled(true);
            MainMenu.D9.setEnabled(true);
            MainMenu.pA9.setEnabled(true);
            MainMenu.pB9.setEnabled(true);
            MainMenu.pC9.setEnabled(true);
            MainMenu.pD9.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A8.getBackground(), MainMenu.B8.getBackground(), MainMenu.C8.getBackground(), MainMenu.D8.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA8, MainMenu.pB8, MainMenu.pC8, MainMenu.pD8);
            
        } else if( counter == 9){
            MainMenu.instruction.setText("Your 9th Guess was evaluated\n Guess again!");
            MainMenu.A9.setEnabled(false);
            MainMenu.B9.setEnabled(false);
            MainMenu.C9.setEnabled(false);
            MainMenu.D9.setEnabled(false);
            MainMenu.A10.setEnabled(true);
            MainMenu.B10.setEnabled(true);
            MainMenu.B10.setEnabled(true);
            MainMenu.C10.setEnabled(true);
            MainMenu.D10.setEnabled(true);
            MainMenu.pA10.setEnabled(true);
            MainMenu.pB10.setEnabled(true);
            MainMenu.pC10.setEnabled(true);
            MainMenu.pD10.setEnabled(true);
            code l = new code();
            l.setCode(MainMenu.A9.getBackground(), MainMenu.B9.getBackground(), MainMenu.C9.getBackground(), MainMenu.D9.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            generateEvaluation2();
            displayEvaluation(MainMenu.pA9, MainMenu.pB9, MainMenu.pC9, MainMenu.pD9);
            
        } else if( counter == 10){
            code l = new code();
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
            
                    codeGuessed();
            
            }
            l.setCode(MainMenu.A10.getBackground(), MainMenu.B10.getBackground(), MainMenu.C10.getBackground(), MainMenu.D10.getBackground());
            lastGuess = l;
            generateEvaluation2();
            displayEvaluation(MainMenu.pA10, MainMenu.pB10, MainMenu.pC10, MainMenu.pD10);
            
        } else if (counter == 11){
            gameLost();
        
        }
        counter ++;
    }
    
    //Displays the evaluation to the screen
    //Pre condition: 4 dufferent buttons as parameters to which the thing has to be displayed
    //Post condition: none
    public static void displayEvaluation(JButton b1, JButton b2, JButton b3, JButton b4){
    
            JButton buttonArray[] = new JButton[4]; 
            buttonArray[0] = b1;
            buttonArray[1] = b2;
            buttonArray[2] = b3;
            buttonArray[3] = b4;
            
            int in = combinationToGuess.inPlace;
            int different = combinationToGuess.differentPlace;
            int no = combinationToGuess.noPlace;
            
            for (int i=0; i<in; i++){ //display the all the white markers
                buttonArray[i].setBackground(Color.WHITE);
            }
            for (int i=in; i<in+different; i++){ //display all the red markers
                buttonArray[i].setBackground(Color.RED);
            }
            for (int i=different; i<different+no; i++){ //display all the black markers
                buttonArray[i].setBackground(Color.BLACK);
            }
    }
    
    //Ends the game and diplays a score on the screen
    //Pre condition: none
    //Post condition: none
    public void codeGuessed(){
        //display the combinationToGuess
        MainMenu.code1.setBackground(combinationToGuess.codeArrangement[0]);
        MainMenu.code2.setBackground(combinationToGuess.codeArrangement[1]);
        MainMenu.code3.setBackground(combinationToGuess.codeArrangement[2]);
        MainMenu.code4.setBackground(combinationToGuess.codeArrangement[3]);
        //display a message about victory
        MainMenu.instruction.setText("Congratulations! You won with a score of "
                + counter + "To play again restart the game.");
        MainMenu.contentPane.setBackground(Color.PINK);
        MainMenu.confirm.setEnabled(false);
        
    }
    
    //Finishes the game if the computer looses
    //Pre condtion: none
    //Post condition:  none
    public void gameLost(){
        //Display the combination chosen by the computer
        MainMenu.code1.setBackground(combinationToGuess.codeArrangement[0]);
        MainMenu.code2.setBackground(combinationToGuess.codeArrangement[1]);
        MainMenu.code3.setBackground(combinationToGuess.codeArrangement[2]);
        MainMenu.code4.setBackground(combinationToGuess.codeArrangement[3]);
        //display the information about a loss to the screen
        MainMenu.instruction.setText("Unforetunately You lost.\nTo play again restart the game.");
        MainMenu.contentPane.setBackground(Color.PINK);
        
    }
    
}
