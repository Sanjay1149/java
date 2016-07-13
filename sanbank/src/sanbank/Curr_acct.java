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
public class Curr_acct {
    public String name;
    public int id;
    public int min_amt = 2000;
    public int amount;
    Scanner in = new Scanner(System.in);
    
    Curr_acct(String n,int i){
        name = n;
        id = i;
    }
    
    public void check_balance(){
        if(amount < min_amt){
            amount = amount - 500 ;
            System.out.println("Your account balance is below minimum balance "
                    + ",we have to service charge 500 rupees for"
                    + "the inconvience\nYour current balance is"
                    + ": " + amount);
        }
        else
            System.out.println("Your acount balance is : " + amount);
        
            }
    public void deposit()
    {
       System.out.println("Enter the amount to be deposited\n");
       int depo = in.nextInt();
       amount = amount+depo;
       System.out.println("Rs. "+depo+" Added to your account");
       check_balance();
    }
   public void withdraw(){
       
       System.out.println("Enter the amount to be Withdrawn \n");
       int with = in.nextInt();
       amount = amount-with;
       System.out.println("Rs. "+with+" debited from your account");
       check_balance();
   }
    
    public void account_detail(int amt){
        amount = amt;
        int c = 1;
        while(c!=0)
        {
           System.out.println("Do you want to \n1.deposit \n2.withdraw \n");
           String ad = in.nextLine();
            switch(ad){
            case "deposit":
            {
                deposit();
                c=0;
                break;
            }
            case "withdraw":
            {
                withdraw();
                c=0;
                break;
            }
            default:
            {
                System.out.println("Enter a valid name");
                break;
            }
            }
        }
    }
    
}
