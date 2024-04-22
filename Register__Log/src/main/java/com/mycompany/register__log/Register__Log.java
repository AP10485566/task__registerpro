/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register__log;

import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Register__Log {

    public static void main(String[] args) {
    //Declare for the variables    
    Scanner getsUserInput = new Scanner(System.in);
    
    System.out.println("*Registration Form*");
    System.out.println("-Fill out the form-");
    System.out.println(" ");
    
    String Firstname;
    String Lastname;
    String username;
    String pass;
    
    //Assign for the variables
    System.out.println("Enter your First name: ");
    Firstname = getsUserInput.nextLine();
    System.out.println("Enter Your Last name: ");
    Lastname = getsUserInput.nextLine();
    System.out.println("Enter Your Username: ");
    username = getsUserInput.nextLine();
    System.out.println("Enter Your Password: ");
    pass = getsUserInput.nextLine();
    
    System.out.println("Registration was Successful!");
    System.out.println(" ");
    
    System.out.println("<-TRY TO LOGIN NOW!->");
    System.out.println(" ");
    
    boolean status = false;
    
    do{
        System.out.println("****LOGIN FORM****");
        System.out.println("Enter your Username: ");
        String correct_username = getsUserInput.nextLine();
        
        System.out.println("Enter your Password: ");
        String correct_pass = getsUserInput.nextLine();
        
        if(correct_username.equals(username)&&(correct_pass.equals(pass))){
            
        System.out.println("Welcome your Username and Password is correct!: ");
        status = true;   
        
        }else{
        System.out.println("Error Username or Password!");
        System.out.println("TRY AGAIN!");    
            
        }
    }while(status==false);
    
    
    }
}
