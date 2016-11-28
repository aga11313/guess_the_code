
package guesscodegame;

import java.awt.Color;
import javax.swing.JButton;


public class defend extends game{
    
    public defend (){
        super();
    }
    
    public void start(){
        
        //disable the "Defend" ang "Game" buttons and enable combination buttons
        MainMenu.defend.setEnabled(false);
        MainMenu.guess.setEnabled(false);
        MainMenu.code1.setEnabled(true);
        MainMenu.code2.setEnabled(true);
        MainMenu.code3.setEnabled(true);
        MainMenu.code4.setEnabled(true);
        
        setArray(); // set the Array of all combinations
        
        //display the starting message on the screen
        MainMenu.instruction.setText("Choose your code\nand confirm it!");
        
    }
    
    public void confirm(){
    
        //executed on the first click of "Confirm" button
        if (counter == 1){
            //MainMenu.buttonPress = false;
            
            //create combinations to guess - object of class code and initiallize it
            code c = new code();
            c.setCode(MainMenu.code1.getBackground(), MainMenu.code2.getBackground(),
                    MainMenu.code3.getBackground(), MainMenu.code4.getBackground());
            combinationToGuess = c;
            
            //display an instruction to the screen
            MainMenu.instruction.setText("The computer made his 1st guess!\nEvaluate it.");
            
            //enable the buttons from the first row
            MainMenu.A1.setEnabled(true);
            MainMenu.B1.setEnabled(true);
            MainMenu.C1.setEnabled(true);
            MainMenu.D1.setEnabled(true);
            MainMenu.pA1.setEnabled(true);
            MainMenu.pB1.setEnabled(true);
            MainMenu.pC1.setEnabled(true);
            MainMenu.pD1.setEnabled(true);
            
            //display the randomly chosen combination from arrayOfCombinations to the screen
            displayGuess(MainMenu.A1, MainMenu.B1, MainMenu.C1, MainMenu.D1);
            
            //create a new object of class code that will store the last guessed combination
            code l = new code();
            l.setCode(MainMenu.A1.getBackground(), MainMenu.B1.getBackground(),
                    MainMenu.C1.getBackground(), MainMenu.D1.getBackground());
            lastGuess = l;
            
            //check if last guessed combination is equal to combinationToGuess
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && 
                    (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && 
                    (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            //if the guess is not correct evaluate it and display it to the screen
            generateEvaluation();
            
            
        } else if (counter == 2){
            //save the user inputted evaluation
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA1.getBackground(), 
                    MainMenu.pB1.getBackground(), MainMenu.pC1.getBackground(), 
                    MainMenu.pD1.getBackground());
            countEvaluation(inputEvaluation);
            
            
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 2nd guess!\nEvaluate it!");
            MainMenu.pA1.setEnabled(false);
            MainMenu.pB1.setEnabled(false);
            MainMenu.pC1.setEnabled(false);
            MainMenu.pD1.setEnabled(false);
            MainMenu.A2.setEnabled(true);
            MainMenu.B2.setEnabled(true);
            MainMenu.C2.setEnabled(true);
            MainMenu.D2.setEnabled(true);
            MainMenu.pA2.setEnabled(true);
            MainMenu.pB2.setEnabled(true);
            MainMenu.pC2.setEnabled(true);
            MainMenu.pD2.setEnabled(true);
            displayGuess(MainMenu.A2, MainMenu.B2, MainMenu.C2, MainMenu.D2);
            code l = new code();
            l.setCode(MainMenu.A2.getBackground(), MainMenu.B2.getBackground(), MainMenu.C2.getBackground(), MainMenu.D2.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
        
        } else if (counter == 3){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA2.getBackground(), MainMenu.pB2.getBackground(), MainMenu.pC2.getBackground(), MainMenu.pD2.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 3rd guess!\nEvaluate it!");
            MainMenu.pA2.setEnabled(false);
            MainMenu.pB2.setEnabled(false);
            MainMenu.pC2.setEnabled(false);
            MainMenu.pD2.setEnabled(false);
            MainMenu.A3.setEnabled(true);
            MainMenu.B3.setEnabled(true);
            MainMenu.C3.setEnabled(true);
            MainMenu.D3.setEnabled(true);
            MainMenu.pA3.setEnabled(true);
            MainMenu.pB3.setEnabled(true);
            MainMenu.pC3.setEnabled(true);
            MainMenu.pD3.setEnabled(true);
            displayGuess(MainMenu.A3, MainMenu.B3, MainMenu.C3, MainMenu.D3);
            code l = new code();
            l.setCode(MainMenu.A3.getBackground(), MainMenu.B3.getBackground(), MainMenu.C3.getBackground(), MainMenu.D3.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 4){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA3.getBackground(), MainMenu.pB3.getBackground(), MainMenu.pC3.getBackground(), MainMenu.pD3.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 4th guess!\nEvaluate it!");
            MainMenu.pA3.setEnabled(false);
            MainMenu.pB3.setEnabled(false);
            MainMenu.pC3.setEnabled(false);
            MainMenu.pD3.setEnabled(false);
            MainMenu.A4.setEnabled(true);
            MainMenu.B4.setEnabled(true);
            MainMenu.C4.setEnabled(true);
            MainMenu.D4.setEnabled(true);
            MainMenu.pA4.setEnabled(true);
            MainMenu.pB4.setEnabled(true);
            MainMenu.pC4.setEnabled(true);
            MainMenu.pD4.setEnabled(true);
            displayGuess(MainMenu.A4, MainMenu.B4, MainMenu.C4, MainMenu.D4);
            code l = new code();
            l.setCode(MainMenu.A4.getBackground(), MainMenu.B4.getBackground(), MainMenu.C4.getBackground(), MainMenu.D4.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 5){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA4.getBackground(), MainMenu.pB4.getBackground(), MainMenu.pC4.getBackground(), MainMenu.pD4.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 5th guess!\nEvaluate it!");
            MainMenu.pA4.setEnabled(false);
            MainMenu.pB4.setEnabled(false);
            MainMenu.pC4.setEnabled(false);
            MainMenu.pD4.setEnabled(false);
            MainMenu.A5.setEnabled(true);
            MainMenu.B5.setEnabled(true);
            MainMenu.C5.setEnabled(true);
            MainMenu.D5.setEnabled(true);
            MainMenu.pA5.setEnabled(true);
            MainMenu.pB5.setEnabled(true);
            MainMenu.pC5.setEnabled(true);
            MainMenu.pD5.setEnabled(true);
            displayGuess(MainMenu.A5, MainMenu.B5, MainMenu.C5, MainMenu.D5);
            code l = new code();
            l.setCode(MainMenu.A5.getBackground(), MainMenu.B5.getBackground(), MainMenu.C5.getBackground(), MainMenu.D5.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 6){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA5.getBackground(), MainMenu.pB5.getBackground(), MainMenu.pC5.getBackground(), MainMenu.pD5.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 6th guess!\nEvaluate it!");
            MainMenu.pA5.setEnabled(false);
            MainMenu.pB5.setEnabled(false);
            MainMenu.pC5.setEnabled(false);
            MainMenu.pD5.setEnabled(false);
            MainMenu.A6.setEnabled(true);
            MainMenu.B6.setEnabled(true);
            MainMenu.C6.setEnabled(true);
            MainMenu.D6.setEnabled(true);
            MainMenu.pA6.setEnabled(true);
            MainMenu.pB6.setEnabled(true);
            MainMenu.pC6.setEnabled(true);
            MainMenu.pD6.setEnabled(true);
            displayGuess(MainMenu.A6, MainMenu.B6, MainMenu.C6, MainMenu.D6);
            code l = new code();
            l.setCode(MainMenu.A6.getBackground(), MainMenu.B6.getBackground(), MainMenu.C6.getBackground(), MainMenu.D6.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 7){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA6.getBackground(), MainMenu.pB6.getBackground(), MainMenu.pC6.getBackground(), MainMenu.pD6.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 7th guess!\nEvaluate it!");
            MainMenu.pA6.setEnabled(false);
            MainMenu.pB6.setEnabled(false);
            MainMenu.pC6.setEnabled(false);
            MainMenu.pD6.setEnabled(false);
            MainMenu.A7.setEnabled(true);
            MainMenu.B7.setEnabled(true);
            MainMenu.C7.setEnabled(true);
            MainMenu.D7.setEnabled(true);
            MainMenu.pA7.setEnabled(true);
            MainMenu.pB7.setEnabled(true);
            MainMenu.pC7.setEnabled(true);
            MainMenu.pD7.setEnabled(true);
            displayGuess(MainMenu.A7, MainMenu.B7, MainMenu.C7, MainMenu.D7);
            code l = new code();
            l.setCode(MainMenu.A7.getBackground(), MainMenu.B7.getBackground(), MainMenu.C7.getBackground(), MainMenu.D7.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 8){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA7.getBackground(), MainMenu.pB7.getBackground(), MainMenu.pC7.getBackground(), MainMenu.pD7.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 8th guess!\nEvaluate it!");
            MainMenu.pA7.setEnabled(false);
            MainMenu.pB7.setEnabled(false);
            MainMenu.pC7.setEnabled(false);
            MainMenu.pD7.setEnabled(false);
            MainMenu.A8.setEnabled(true);
            MainMenu.B8.setEnabled(true);
            MainMenu.C8.setEnabled(true);
            MainMenu.D8.setEnabled(true);
            MainMenu.pA8.setEnabled(true);
            MainMenu.pB8.setEnabled(true);
            MainMenu.pC8.setEnabled(true);
            MainMenu.pD8.setEnabled(true);
            displayGuess(MainMenu.A8, MainMenu.B8, MainMenu.C8, MainMenu.D8);
            code l = new code();
            l.setCode(MainMenu.A8.getBackground(), MainMenu.B8.getBackground(), MainMenu.C8.getBackground(), MainMenu.D8.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 9){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA8.getBackground(), MainMenu.pB8.getBackground(), MainMenu.pC8.getBackground(), MainMenu.pD8.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 9th guess!\nEvaluate it!");
            MainMenu.pA8.setEnabled(false);
            MainMenu.pB8.setEnabled(false);
            MainMenu.pC8.setEnabled(false);
            MainMenu.pD8.setEnabled(false);
            MainMenu.A9.setEnabled(true);
            MainMenu.B9.setEnabled(true);
            MainMenu.C9.setEnabled(true);
            MainMenu.D9.setEnabled(true);
            MainMenu.pA9.setEnabled(true);
            MainMenu.pB9.setEnabled(true);
            MainMenu.pC9.setEnabled(true);
            MainMenu.pD9.setEnabled(true);
            displayGuess(MainMenu.A9, MainMenu.B9, MainMenu.C9, MainMenu.D9);
            code l = new code();
            l.setCode(MainMenu.A9.getBackground(), MainMenu.B9.getBackground(), MainMenu.C9.getBackground(), MainMenu.D9.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            
        } else if (counter == 10){
            evaluation inputEvaluation = new evaluation();
            inputEvaluation.setEvaluation(MainMenu.pA9.getBackground(), MainMenu.pB9.getBackground(), MainMenu.pC9.getBackground(), MainMenu.pD9.getBackground());
            countEvaluation(inputEvaluation);
            MainMenu.instruction.setText("Your evaluation was saved.\nComputer made his 10th guess!\nEvaluate it!");
            MainMenu.pA9.setEnabled(false);
            MainMenu.pB9.setEnabled(false);
            MainMenu.pC9.setEnabled(false);
            MainMenu.pD9.setEnabled(false);
            MainMenu.A10.setEnabled(true);
            MainMenu.B10.setEnabled(true);
            MainMenu.C10.setEnabled(true);
            MainMenu.D10.setEnabled(true);
            MainMenu.pA10.setEnabled(true);
            MainMenu.pB10.setEnabled(true);
            MainMenu.pC10.setEnabled(true);
            MainMenu.pD10.setEnabled(true);
            displayGuess(MainMenu.A10, MainMenu.B10, MainMenu.C10, MainMenu.D10);
            code l = new code();
            l.setCode(MainMenu.A10.getBackground(), MainMenu.B10.getBackground(), MainMenu.C10.getBackground(), MainMenu.D10.getBackground());
            lastGuess = l;
            if ((lastGuess.codeArrangement[0] == combinationToGuess.codeArrangement[0]) && (lastGuess.codeArrangement[1] == combinationToGuess.codeArrangement[1]) &&
                    (lastGuess.codeArrangement[2] == combinationToGuess.codeArrangement[2]) && (lastGuess.codeArrangement[3] == combinationToGuess.codeArrangement[3])){
                
                codeGuessed();
            
            }
            generateEvaluation();
            gameLost();
            
        }
        
        counter++;
    }
    
    //Counts the amount of elements in place, different place and out of place
    //Pre condition: Input of an evaluation
    //Post condition: none
    public void countEvaluation(evaluation e){
        
        int inPlace = 0;
        int differentPlace = 0;
        int noPlace = 0;
        //count the amount of white red and black markers
        for (int i = 0; i<=3; i++){
            if (e.evaluationArrangement[i] == Color.WHITE){
                inPlace++;
            } else if (e.evaluationArrangement[i] == Color.BLACK){
                noPlace++;
            } else if (e.evaluationArrangement[i] == Color.RED){
                differentPlace++;
            }
        }
        //call the eliminate combination method
        eliminateCombiations(inPlace, differentPlace, noPlace);   
    }
    
    //Eliminated impossible combinations from the combinationsArray
    //Pre condition: amount of colors inPlace, in a different place and out of place
    //Post condition: none
    public void eliminateCombiations(int in, int different, int not){
        
        for (int i = 0; i < combinationsArray.length; i++){
            if (combinationsArray[i].considered == true){ 
                if ((combinationsArray[i].inPlace != in) || 
                        (combinationsArray[i].differentPlace != different) 
                        || (combinationsArray[i].noPlace != not)){ 
                    //if combination is still considered and not all of the markers are the same
                    //mark this combiantion as false
                    combinationsArray[i].considered = false;

                }
            }
        }
    }
    
    //Ends the game and diplays a score on the screen
    //Pre condition: none
    //Post condition: none
    public void codeGuessed(){
    
        //display instruction about the end of the game and the score
        MainMenu.instruction.setText("The computer won with a score of " +
                counter + ". \nRestart the game to play again\n");
        //change background color
        MainMenu.contentPane.setBackground(Color.PINK);
        MainMenu.confirm.setEnabled(false); //disable the confirm button
        counter = 0;
    
    }
    
    //Finishes the game if the computer looses
    //Pre condtion: none
    //Post condition:  none
    public void gameLost(){
        //display a message about loss
        MainMenu.instruction.setText("The computer lost. To play again restart the game.");
        MainMenu.contentPane.setBackground(Color.PINK);
        MainMenu.confirm.setEnabled(false);
        counter = 0;
    
    }
    
}
