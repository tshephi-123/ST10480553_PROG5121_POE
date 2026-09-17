/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10480553_prog5121_poe;

import java.util.regex.Pattern;
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
            boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");
            
            isValid = hasCapital && hasDigit && hasSpecial;
        }
        return isValid;
    }
    
    //method to check cell phone number validation
    boolean checkCellPhoneNumber(String phoneNum){
        boolean isValid = false;
        if (phoneNum.length() != 0){
            isValid = Pattern.matches("^\\+27[0-9]{9}$", phoneNum);
        }
        return isValid;
    }
    
    //method to register the user
    public String registerUser(String userName, String password, String phoneNum){
        if (!checkUserName(userName)) {
            return "Username is not correctly formatted; please ensure that the ussername contains an underscore and is more than five characters in length.";
        }
        if (!checkPassword(password)){
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number,and a special character.";
        }
        if (!checkCellPhoneNumber(phoneNum)){
            return "Cell phone number is incorrecly formatted or does not contain international code.";
        }
        return "User successfully registered.";
    }
     
    //autheenticating login user information
     public boolean loginUser(String inputUsername, String inputPassword, String storedUsername,String storedPassword){
        boolean isValid = false;
        if (inputUsername.length() != 0 && inputPassword.length() !=0){
            isValid = inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword);
           }
        return isValid;
    }
    
   //display message
    public String returnLoginStatus(boolean isLoggedIn, String firstName, String lastName){
        if (isLoggedIn){
            return "Welcom " + firstName + " ," + lastName + "it is great to see you again. ";
        }
        else{
            return "Username or password incorrect, please try again.";
        }
    }
}

