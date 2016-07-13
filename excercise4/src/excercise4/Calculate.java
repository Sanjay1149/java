/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise4;

/**
 *
 * @author 14bit43
 */
public class Calculate {
    
      float calc(int q,float price){
        float am = q * price;
        return am;
    }
    int check(int q){
        if(q<0)
            return 0;
        else
            return q;
    }
    float check(float price){
        if(price < 0)
            return 0;
        else
            return price;
                    
    }
    
}
