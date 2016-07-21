/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ran;

import java.util.Random;
import java.util.Scanner;
import dom.dom;
/**
 *
 * @author 14bit43
 */
public class Ran {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("No of Rolls : - ");
        int n = in.nextInt();
        
        Random r = new Random();
        
        int[] arr = new int[n];
        
        System.out.println("Do you want to give no.of.faces ?? : "
                + "\nPress 1 for YES\nPress 2 for NO"
                );
        
        int swi = in.nextInt();
        
            dom d = new dom();
        if(swi==1)
        {
            System.out.println("Enter the no.of.faces :");

            int a = in.nextInt();

            for(int i=0;i<n;i++)
            {
                arr[i] = r.nextInt(a)+1;}

            d.display(arr);
        }
        else
        {
            d.display(arr,6);
        }
      in.close();
    }
}
