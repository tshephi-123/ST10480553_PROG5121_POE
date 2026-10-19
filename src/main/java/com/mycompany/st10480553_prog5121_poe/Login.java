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
    public boolean checkUserName(String userName){
        if(userName == null ) {
            return false;
        }
        return userName.contains("_") && userName.length() <=5;
    }
          
    // check the password complexity
     public boolean checkPassword(String password){
           if(password == null || password.length()<8){
               return false;
           }
            boolean hasCapital = Pattern.compile("[A-Z]").matcher(password).find();
            boolean hasDigit = Pattern.compile("[0-9]").matcher(password).find();
            boolean hasSpecial = Pattern.compile("[a-zA-Z0-9]").matcher(password).find();
            
            return hasCapital && hasDigit && hasSpecial;
        }
      
    //method to check cell phone number validation
    public boolean checkCellPhoneNumber(String phoneNum){
        if (phoneNum == null) {
            return false;
        }
        return Pattern.matches("^\\+27[0-9]{9}$", phoneNum);
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
        if (inputUsername == null || inputPassword == null || storedUsername == null || storedPassword == null){
        return false;
        }
        return inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword);    
     }
            
     //display message
    public String returnLoginStatus(boolean isLoggedIn, String firstName, String lastName){
        if (isLoggedIn){
            return "Welcome " + firstName + " ," + lastName + " it is great to see you again.";
        }
        else{
            return "Username or password incorrect, please try again.";
        }
    }
}

