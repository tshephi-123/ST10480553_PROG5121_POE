/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10480553_prog5121_poe;

/**
 *
 * @author dulcy
 */
public class Login {
    // Check username and make sure: must not be empty, should contain '_', and max 5 characters
    boolean checkUserName(String userName){
        boolean isValid =false;
        if(userName.length() !=0) {
            isValid = userName.contains("_") && userName.length ()<=5;
        }
        return isValid;
    }
    
    //method to check the password complexity
    boolean checkPassword(String password){
        boolean isValid = false;
        if(password.length() !=0 && password.length()>=8){
            boolean hasCapital = !password.equals(password.toLowerCase());
            boolean hasDigit = password.matches(".*\\d.*");
            boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=[\\]{};':\"\\\\|,.<>/?].*");
            
            isValid = hasCapital && hasDigit && hasSpecial;
        }
        return isValid;
    }
    
}
