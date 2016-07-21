/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanbank;

import java.util.Scanner;

/**
 *
 * @author 14bit43
 */
public class Account {

    public static String Cust_name;
    public static int acc_no;
    public static String acc_name;
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        
        System.out.println("Enter the Customer name : ");
        Cust_name = in.nextLine();
        System.out.println("Enter Account number :");
        acc_no = Integer.parseInt(in.next());
        in.nextLine();
            System.out.println("Enter Account name : \n1.Current Account"
                + "\n2.Savings Account ");
            acc_name = in.nextLine();
        switch(acc_name)
        {

            case "Current Account" :
            {
                
                Curr_acct cus = new Curr_acct(Cust_name,acc_no);
                System.out.print("Creating your account ...... \nEnter the "
                        + "amount you want :  ");
                int am = in.nextInt();
                cus.account_detail(am);
                
                break;
            }
            case  "Savings Account"  :
            {
                    Sav_acct sav = new Sav_acct(Cust_name,acc_no);
                    System.out.print("Creating your account ...... \nEnter the "
                            + "amount you want :  ");
                    int am = in.nextInt();
                    sav.interest(am);
                    break;
            }
            default :
            {
                System.out.println("Enter a Valid Account name with the "
                        + "same UPPER and lower case used ");
                break;
            }
        }
        in.close();
}
}

