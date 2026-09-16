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
        
        //Ask user to enter name and surname
        System.out.print("Enter first name: ");
        firstName = myInput.nextLine();
        
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
        
        //Loop the password to check if it's valid or not
        System.out.print("Enter password (min 8 chars, 1 uppercase, 1 number, 1 special char):");
        password = myInput.nextLine();
        
        while(!login.checkPassword(password)){
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a caoital letter, a number,and a special character.");
            System.out.print("Please re-enter password: ");
            password = myInput.nextLine();
        }
        System.out.println("Password successfully captured.");
        
        
    }
}
