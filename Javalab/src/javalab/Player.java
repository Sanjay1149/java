/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.Scanner;
/**
 *
 * @author 14bit43
 */
public class Player {
    public static void main(String args[]){
        String a;
        int in,run,noout;
        Scanner s = new Scanner(System.in);
        System.out.println("Player name is :");
        a = s.nextLine();
        System.out.println("Enter the Innings");
        in = s.nextInt();
        System.out.println("Enter the No . Of . Run");
        run = s.nextInt();
        System.out.println("Enter the Innings he was not out");
        noout = s.nextInt();
        Info i = new Info();
        i.display(a,in,run,noout);
    }
}
