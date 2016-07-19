/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanbank;

/**
 *
 * @author 14bit43
 */
public class Sav_acct {
    public String name;
    public int id;
    
    Sav_acct(String n,int i){
        name = n;
        id = i;
    }
    
    public void interest(int amount){
    	int amount += amount * (5/100);
    	System.out.println("The amount with interest is " + amount);
    }
}
