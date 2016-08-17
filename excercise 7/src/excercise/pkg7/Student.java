/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.pkg7;

import java.util.Scanner;

/**
 *
 * @author 14bit50
 */
public class Student extends Master {

    static String ans[] = {"c","b","d","b","a","a","c","b","c","a"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String[] val =  new String[10];
        Master m = new Master();
        System.out.println("            Welcome to Sanjay's quiz");
        val=m.question(val);
        int mark=0;
        for(int i=0;i<10;i++){
           if(val[i].equals(ans[i])){
               mark++;
           }
        }
        
        System.out.println("Mark Scored By You is "+mark);
        // TODO code application logic here
    }
}
