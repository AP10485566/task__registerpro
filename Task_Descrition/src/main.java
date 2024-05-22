/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class main {
private String loginUsername;
private String loginPassword;
private String firstName;
private String lastName;
private String registerPassword;
private String registerUsername;



public boolean isUsernameValid(){
    if(registerUsername.length()>5){
        return false;
    }
    for(char ch:registerUsername.toCharArray()){
        if(ch=='_'){
            return true;
        }
    }
    return false;
}   
public boolean isPasswordComplex(){
    if (registerPassword.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false, hasDigit = false, hasSpecialChar = false;
        for (char ch : registerPassword.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasDigit && hasSpecialChar;
    }

    /* Provides feedback on registration */
    public String registerUser() {
        if (isUsernameValid()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted. Ensure it contains an underscore and is no more than 5 characters.");
        }

        if (isPasswordComplex()) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted. Ensure it contains at least 8 characters, a capital letter, a number, and a special character.");
        }

        if (isUsernameValid() && isPasswordComplex()) {
            System.out.println("Both conditions met. User successfully registered.");
        } else {
            if (!isUsernameValid()) {
                System.out.println("Username is incorrectly formatted.");
            }
            if (!isPasswordComplex()) {
                System.out.println("Password does not meet complexity requirements.");
            }
        }
        return "";
    }

    /* Checks if the provided username and password match the registered ones */
    public boolean loginUser() {
        return loginUsername.equals(registerUsername) && loginPassword.equals(registerPassword);
    }

    /* Returns login status */
    public String getLoginStatus() {
        if (loginUser()) {
            System.out.println("Successful login.");
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");
        } else {
            System.out.println("Failed login. Username or password incorrect. Please try again.");
        }
        return "";
    }

    public static void main(String[] args) {
        main usermain = new main();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        usermain.firstName = scanner.next();
        System.out.print("Enter Last Name: ");
        usermain.lastName = scanner.next();

        System.out.print("Enter Username: ");
        usermain.registerUsername = scanner.next();
        System.out.print("Enter Password: ");
        usermain.registerPassword = scanner.next();

        usermain.registerUser();

        System.out.print("Enter Login Username: ");
        usermain.loginUsername = scanner.next();
        System.out.print("Enter Login Password: ");
        usermain.loginPassword = scanner.next();

        usermain.getLoginStatus();
        
    }
}
 
   
       
    
    

