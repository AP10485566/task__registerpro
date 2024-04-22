/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package register_loginpro;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Register_Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner getsUserInput = new Scanner(System.in);
       
       System.out.println("-Registration Form-");
       System.out.println("*Fill out the following details...");
       System.out.println(" ");
       
       System.out.println("Enter your Name: ");
       String name = getsUserInput.nextLine(); 
       
       System.out.println("Enter your Address: ");
       String address = getsUserInput.nextLine();
       
       System.out.println("Enter your Phone number: ");
       String pn = getsUserInput.nextLine();
       
       System.out.println("Enter your Email: ");
       String email = getsUserInput.nextLine();
       
       System.out.println("Enter your Password: ");
       String pass = getsUserInput.nextLine();
       
      
    }
    
}
