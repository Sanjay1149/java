/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise5;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 14bit43
 */
public class Login {

    public int age;
    public static String REGEX = "^[a-zA-Z0-9]*$";
    public static Pattern pattern;
    public static Matcher matcher;
    public static String username;
    public String password;
    public String email;
    public static void main(String[] args) throws PassException {
        // TODO code application logic here
        int check=0;
        Login log = new Login();
        Scanner in = new Scanner(System.in);
        System.out.println("-----------------------------WELCOME TO SAN WEBSITE----------------------------\n\n");
        System.out.println("               LOGIN HERE\n");
        try{
        System.out.println("Username :");
        username = in.nextLine();
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(username);
        if(matcher.matches()==false){
            throw new PassException("The Username must only contain Alphabets and Numbers");
        }
        System.out.println("Password :");
        log.password = in.nextLine();
        if(log.password.length()<6||log.password.length()>8)
            throw new PassException("PAssword must be of 6 - 8 charcter in length");
        System.out.println("Email :");
        log.email = in.nextLine();
        for(int i=0;i<log.email.length();i++){
            if(log.email.charAt(i)=='@')
                check=1;
        }
        if(check==0){ 
            throw new PassException("The Email must have @ sign");
        }
        System.out.println("Age :");
        log.age = in.nextInt();
        if(log.age<=0){
            throw new PassException("Age entered is lesser or equal to zero");
        }
        System.out.println("               Account Created Successfully");
        }
        catch(PassException e){
            System.out.println(e);
        }
    }
}