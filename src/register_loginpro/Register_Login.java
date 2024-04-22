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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Declare the variables
       Scanner getsUserInput = new Scanner(System.in);
       
       System.out.println("*Registration Form*");
       System.out.println("-Fill out the form-");
       System.out.println(" ");
       
       
       
       String username;
       String name;
       String surname;
       String pass;
       
             
       //Assign for the variables
       System.out.println("Enter your Username: ");
       username = getsUserInput.nextLine();
       System.out.println("Enter your Name: ");
       name = getsUserInput.nextLine(); 
       System.out.println("Enter your Surname: ");
       surname = getsUserInput.nextLine();
       System.out.println("Enter your Password: ");
       pass = getsUserInput.nextLine();
       
       System.out.println("Registration was Successful!");
       System.out.println(" ");
       
       System.out.println("<-Try To Login now!->");
       System.out.println(" ");
       
       boolean status = false;
       
       do{
           System.out.println("***LOGIN FORM***");
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





       
           
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
       
       
       
      
    
    

