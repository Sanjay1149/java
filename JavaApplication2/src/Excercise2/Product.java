/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise2;

import java.util.Scanner;

/**
 *
 * @author 14bit43
 */
public class Product {

     public int p,prod;
    /**
     * @param args the command line arguments
     */
     
        Product(){
            p =0;
            prod = 1;
        }
        int prod(int digit){
            while(digit!=0){
               p =  digit % 10;
               prod*=p;
               digit = digit/10;
          }
            return prod;
        }
        
        
    public static void main(String[] args) {
      
        Product pro = new Product();
        int d=0 , p=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        d = in.nextInt();
        p = pro.prod(d);
        System.out.println("The product of the digit " + d + " is " + p);
    }
    
}
