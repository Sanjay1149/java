/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author 14bit43
 */
public class Info {
    

    
    float calcaverage(int i,int r,int out){
        float avg = r / (i - out);
        return avg ;
    }
    
    
    public void display(String s,int i,int r,int o){
        System.out.println("The Player name is :" + s + "\n He has played " + i
                + " Inning so far !!\nHe has scored " + r + " runs and is not "
                + " out for " + o + " games" );
        float avg = calcaverage(i,r,o);
        System.out.println("Average Score is : " + avg );
    }
    
    
}
