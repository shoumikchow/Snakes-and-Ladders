
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoumik
 */
public class Player {
    int score=0;
    
    public void LadderOrSnake(int n){
    
        //Ladders!
         if (score==5){
         score=35;
         }
         if (score==18){
         score=39;
         }
         if (score==30){
         score=53;
         }
         if (score==59){
         score=85;
         }
         if (score==67){
         score=75;
         }
         if (score==70){
         score=89;
         }
         //Snakes!
         if (score==24){
         score=13;
         }
         if (score==57){
         score=33;
         }
         if (score==86){
         score=38;
         }
         if (score==88){
         score=51;
         }
         if (score==97){
         score=61;
         }
        
    }
}
