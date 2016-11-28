/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesscodegame;

import java.awt.Color;
import javax.swing.JButton;


public class game {
    
    public code combinationsArray[] = new code[49*49]; //Array of all combiantions
    public static code lastGuess = new code();//previously guessed combination
    public static code combinationToGuess = new code();//the original combination to be guessed
    correct comparison[] = new correct[16*16];
    int counter = 1;//counter for the confirm method
    Color colorArray[] = new Color[7];//an array of all code colors
    
    
    
    public game(){
        //an array that converts numbers to colors
        colorArray[0] = Color.BLACK;
        colorArray[1] = Color.GREEN;
        colorArray[2] = Color.BLUE;
        colorArray[3] = Color.YELLOW;
        colorArray[4] = Color.ORANGE;
        colorArray[5] = Color.RED;
        colorArray[6] = Color.WHITE;
        
    
    }
    
    //fills the comibnationsArray[] with all possible codes
    //Pre condition: none
    //Post condition: none
    public void setArray(){
    
    int n = 0;
    code c;
        
        for (int i=0; i<=6; i++){    
            for (int j=0; j<=6; j++){
                for (int k=0; k<=6; k++){
                    for (int l=0; l<=6; l++){

                            c = new code();
                            //set the nth cell of the combinations array with 4 colors using the color Array
                            c.setCode(colorArray[i],colorArray[j],colorArray[k],colorArray[l]);
                            combinationsArray[n] = c;
                            n++;

                    }
                }
            }   
        }
    }
    
    //compares all objects of the combinationArray with an input code 
    //Pre condititon: two code objects on input
    //Post condition: none
    public void generateEvaluation(){
    
    int codeCountArray[] = new int[7];
    int inputCountArray[] = new int[7];
    
    //initialize all variables to 0
    for(int i = 0; i < combinationsArray.length; i++ ){
        combinationsArray[i].inPlace = 0;
        combinationsArray[i].differentPlace = 0 ;
        combinationsArray[i].noPlace = 0 ;
    }
    
    for (int i = 0; i < combinationsArray.length; i++ ){
        for (int m = 0; m<= 6; m++){ //initiazile the color count to 0
            codeCountArray[m] = 0;
            inputCountArray[m] = 0;
        }
        for (int j = 0; j<=3; j++){
            //compare the total amount of markers of each color in two codes
            for(int k = 0; k<=6; k++){
                if (combinationsArray[i].codeArrangement[j] == colorArray[k]){
                    inputCountArray[k]++;
                }
                if (defend.lastGuess.codeArrangement[j] == colorArray[k]){
                    codeCountArray[k]++;
                }
            }//count the amount of colors inPlace
            if(combinationsArray[i].codeArrangement[j] == defend.lastGuess.codeArrangement[j]){
                combinationsArray[i].inPlace++;
            }
        }
        for(int k = 0; k<=6; k++){
            if (codeCountArray[k] > inputCountArray[k]){ //count the amount of colors not in the code
                combinationsArray[i].noPlace = combinationsArray[i].noPlace + (codeCountArray[k] - inputCountArray[k]);
            }
        } // count the amount of colors in differentPlace
        combinationsArray[i].differentPlace = 4 - combinationsArray[i].noPlace - combinationsArray[i].inPlace;
    }
    }  
    
    //Choose a random element of combinationsArray marked as considered
    //Pre condition: none
    //Post condition: return an array of Colors
    public  Color[] random(){
       boolean a = true;
       Color result[] = new Color[4]; //create a 4 element array
       while (a){
            int randomNum = 0 + (int)(Math.random()*49*49); //generate random number from 0 to 2401
            
            //check if element is still considered
            if (combinationsArray[randomNum].considered == true){
                
                result = combinationsArray[randomNum].codeArrangement;
                a = false;

            }
       }
       
       return result;
       
    }
    
    //Display the guess to the screen
    //Pre condition: four JButtons input as parameters
    //Post condition: none
    public void displayGuess(JButton b1, JButton b2, JButton b3, JButton b4){
        
        b1.setBackground(random()[0]);
        b2.setBackground(random()[1]);
        b3.setBackground(random()[2]);
        b4.setBackground(random()[3]);
        
    }
    
    
    //compares two codes and generates an evaluation 
    //Pre condititon: two code objects on input
    //Post condition: none
    public void generateEvaluation2(){
    
        //int n = 0;
        
    int codeCountArray[] = new int[7];
    int inputCountArray[] = new int[7];
    
    //initialize all variables to 0
    combinationToGuess.inPlace = 0;
    combinationToGuess.differentPlace = 0 ;
    combinationToGuess.noPlace = 0 ;

        for (int m = 0; m<= 6; m++){ //initiazile the color count to 0    
            codeCountArray[m] = 0;
            inputCountArray[m] = 0;
        }
        for (int j = 0; j<=3; j++){
            for(int k = 0; k<=6; k++){ //compare the total amount of markers of each color in two codes
                if (combinationToGuess.codeArrangement[j] == colorArray[k]){
                    inputCountArray[k]++;
                }
                if (defend.lastGuess.codeArrangement[j] == colorArray[k]){
                    codeCountArray[k]++;
                }
            } //count the amount of colors inPlace
            if(combinationToGuess.codeArrangement[j] == guess.lastGuess.codeArrangement[j]){
                combinationToGuess.inPlace++;
            }
        }
        for(int k = 0; k<=6; k++){
            if (codeCountArray[k] > inputCountArray[k]){ //count the amount of colors not in the code
                combinationToGuess.noPlace = combinationToGuess.noPlace + (codeCountArray[k] - inputCountArray[k]);
            }
        } // count the amount of colors in differentPlace
        combinationToGuess.differentPlace = 4 - combinationToGuess.noPlace - combinationToGuess.inPlace;
    }
}
