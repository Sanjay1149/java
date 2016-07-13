/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise4;

import java.util.Scanner;

/**
 *
 * @author 14bit43
 */
public class Invoice {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Calculate c = new Calculate();
        int id,q;
        float price;
        String dn;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Id of the product ");
        id=in.nextInt();
        System.out.println("Enter the Price of the product ");
        price=in.nextFloat();
        System.out.println("Enter the Quantity of the product ");
        q=in.nextInt();
        System.out.println("Description of the product ");
        dn=in.nextLine();
        
        float am;
        q=c.check(q);
        price = c.check(price);
        am=c.calc(q,price);
        System.out.println("Total amount is " + am);
    }
    
}
