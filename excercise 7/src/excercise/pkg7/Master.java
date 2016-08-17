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
public class Master {
    
    public String[] question(String[] a) throws Exception{
        Scanner in = new Scanner(System.in);
        int i=0;
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 15000;
        try{
        while(System.currentTimeMillis() < endTime){
                switch(i)
             {
                  case 0:{
                            System.out.println("\n\nWhat is 1+2 = ? ");
                            System.out.println("    a.1      b.2  ");
                            System.out.println("    c.3      d.4  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
                   case 1:{
                            System.out.println("\n\nWhat is 1*2 = ? ");
                            System.out.println("    a.1      b.2  ");
                            System.out.println("    c.3      d.4  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
                 case 2:{
                            System.out.println("\n\nWhat is 2*2 = ? ");
                            System.out.println("    a.1      b.2  ");
                            System.out.println("    c.3      d.4  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
                 case 3:{
                            System.out.println("\n\nWhat is C ");
                            System.out.println("    a.play toy     b.Programming language  ");
                            System.out.println("    c.Gaming      d.TV Show  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }          
            case 4:{
                            System.out.println("\n\nWhat is 4+5 = ? ");
                            System.out.println("    a.9      b.-2  ");
                            System.out.println("    c.7      d.4  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
            case 5:{
                            System.out.println("\n\nWhat is 2+2-3 = ? ");
                            System.out.println("    a.1      b.2  ");
                            System.out.println("    c.3      d.4  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
            case 6:{
                            System.out.println("\n\nWhat is 1+2*6 = ? ");
                            System.out.println("    a.18      b.12  ");
                            System.out.println("    c.13      d.15  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
            case 7:{
                            System.out.println("\n\nWho is IT topper = ? ");
                            System.out.println("    a.shilpa      b.sabari  ");
                            System.out.println("    c.brindha     d.divya  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
            case 8:{
                            System.out.println("\n\nWhat is 1+2-5-4+3 = ? ");
                            System.out.println("    a.-1      b.-2  ");
                            System.out.println("    c.-3      d.-4  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
            case 9:{
                            System.out.println("\n\nWhat is 7+7-3 = ? ");
                            System.out.println("    a.11      b.12  ");
                            System.out.println("    c.13      d.14  ");
                            a[i]=in.nextLine();
                            i++;
                            break;
                        }
               
            }
               if(System.currentTimeMillis() > endTime) {
                throw new Exception("Exceeded the max limit sorry");
            }
        }
  }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            return a;
       }
   }
}
