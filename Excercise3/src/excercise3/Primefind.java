/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise3;

/**
 *
 * @author 14bit43
 */
public class Primefind {
    
    public int less(int p1,int p2){
        if(p1>p2)
            return p2;
        else
            return p1;
    }
    public int prime(int p){
        int i;
        for(i=2;i<p/2;i++){
            if(p%i==0)
                return 1;
        }
        return 0;
    }
    public void findprime(int p1 , int p2){
       
        int pr1,pr2;
        pr1 = less(p1,p2);
        if(pr1==p1)
            pr2=p2;
        else
            pr2=p1;
        System.out.println("Prime numbers are : ");
        for(int i=pr1+1;i<pr2;i++)
        {
            int prm;
            prm=prime(i);
            if(prm==0)
                System.out.println(i);
    }

    }
}
