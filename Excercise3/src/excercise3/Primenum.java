/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise3;

import java.util.Scanner;

/**
 *
 * @author 14bit43
 */
public class Primenum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Primefind  pri = new Primefind();
        int p1 , p2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two prime numbers ");
        p1 = in.nextInt();
        p2 = in.nextInt();
        pri.findprime(p1,p2);
    }
    
}
