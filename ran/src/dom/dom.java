/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dom;
import java.util.Random;
/**
 *
 * @author 14bit43
 */
public class dom {
    
    public void display(int[] arr)
    {
        for(int i=1;i<=arr.length;i++){
            System.out.println("Try " + i + " ,We get value as "+ arr[i-1]);
        }
    }
    
    public void display(int[] arr,int n){
        
            Random r = new Random();
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = r.nextInt(n)+1;
                int num = i+1;
            System.out.println("Try " + num + " ,We get value as "+ arr[i]);
            
            }
    }
}
