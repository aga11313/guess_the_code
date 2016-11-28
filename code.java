
package guesscodegame;

import java.awt.Color;


public class code {
    
    Color codeArrangement[] = new Color[4];//an array of 4 colors
    boolean considered = true;//variable that describes if its still cosidered in the game
    int inPlace, differentPlace, noPlace;//counter for evaluation Buttons
    
    public code(){
        
    }
    
    //Sets four input colors as variables of a code object
    //Pre condtion: 4 colors iputted as parameters when the method is called
    //Post codition: none
    public void setCode(Color c1, Color c2, Color c3,Color c4){
    
        codeArrangement[0] = c1;
        codeArrangement[1] = c2;
        codeArrangement[2] = c3;
        codeArrangement[3] = c4;
        considered = true;
        inPlace = 0;
        differentPlace = 0;
        noPlace = 0;
        
    }
}
