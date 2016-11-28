/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesscodegame;

import java.awt.Color;


public class evaluation {
    Color evaluationArrangement[] = new Color[4];
    
    public evaluation(){
        
    }
    
    public void setEvaluation(Color e1, Color e2, Color e3, Color e4){
    
        evaluationArrangement[0] = e1;
        evaluationArrangement[1] = e2;
        evaluationArrangement[2] = e3;
        evaluationArrangement[3] = e4;
        
    }
}
