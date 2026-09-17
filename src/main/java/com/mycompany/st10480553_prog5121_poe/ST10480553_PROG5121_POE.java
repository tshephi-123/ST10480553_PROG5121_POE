/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10480553_prog5121_poe;

import java.util.Scanner;

/**
 *
 * @author dulcy
 */
public class ST10480553_PROG5121_POE {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Login login = new Login();
        //Declaration
        String firstName;
        String lastName;
        String userName;
        String phoneNum;
        String password;
        
        //Ask user to enter name 
        System.out.print("Enter first name: ");
        firstName = myInput.nextLine();
        //Ask user to enter surname
        System.out.print("Enter last name: ");
        lastName = myInput.nextLine();
        
        //Loop the username to check if it's valid or not
        System.out.print("Enter Username(must contain '_' and max 5 char): ");
        userName = myInput.nextLine();
        
        while(!login.checkUserName(userName)){
            System.out.println("Username is not correctly formatted; please ensure that the ussername contains an underscore and is more than five characters in length.");
            System.out.print("Please re-enter username: ");
            userName = myInput.nextLine();
             }
        System.out.println("Username successfully captured.");
        
        //Loop the password to check if it's valid 
        System.out.print("Enter password (min 8 chars, 1 uppercase, 1 number, 1 special char):");
        password = myInput.nextLine();
        
        while(!login.checkPassword(password)){
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number,and a special character.");
            System.out.print("Please re-enter password: ");
            password = myInput.nextLine();
        }
        System.out.println("Password successfully captured.");
        
        
       
        //A loop to confirm if the phone number is valid
        System.out.print("Enter cell phone number(e.g., +27131961976): ");
        phoneNum = myInput.nextLine();
        
        //make sure the cell phone number fits the required format
     while(!login.checkCellPhoneNumber(phoneNum)){
            System.out.println("Cell phone number is incorrecly formatted or does not contain international code.");
            System.out.print("Please re-enter cell phone number: ");
            phoneNum = myInput.nextLine();
     }
     System.out.println("Cell phone number successfully captured.");
     
     //Sending captured details to register the user and display the status
     String registrationStatus = login.registerUser(userName, password, phoneNum);
     System.out.println("Registration status: "+ registrationStatus);
     
     //Authenticating login user inforamtion
     System.out.println("User login");
     
     System.out.print("Enter Username: ");
     String inputUserName = myInput. nextLine();
     System.out.print("Enter Password: ");
     String inputPassword = myInput.nextLine();
     
     //displaying login status
     boolean isLoggedIn = login.loginUser(inputUserName, inputPassword, userName, password);
     String loginStatusMessage = login.returnLoginStatus(isLoggedIn, firstName, lastName);
     
     System.out.println("Login Status: " +loginStatusMessage);
     
    
     }
}
