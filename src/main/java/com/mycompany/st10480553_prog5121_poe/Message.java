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
public class Message {
    //Ensures that the message ID is not more than 10 characters long.
    public boolean checkMessID(String messageID){
        return messageID != null && messageID.length() <=10;
    }
    
    //Check if the recipient cell number format has an international code.
        String checkRecCell(String recipient){
            if (recipient != null && recipient.matches("^\\+27[0-9]{9}$")){
                return "Cell phone number successfully captured.";
            }
            else{
                return "Cell phone number is incorrectly formatted or does not contain an international code. Please try again.";
             }
        }
    
        //Check if the message does not exceed 250 characters.
            String sentMess(String message){
                if (message != null && message.length() <= 250){
                    return "Message ready to send.";
                }
                else{
                    int excess =message == null ? 0: message.length()-250;
                    return "Message exceeds 250 characters by " + excess + "; please reduce the size.";
                }
            }
            
            //Create a message hash: first 2 digits of message ID, colon, message number, colon,first and last words in ALL CAPS
            String createMessHash(String messageID, int messageNum, String message){
                String idPart = (messageID != null && messageID.length() >=2) ? messageID.substring(0,2) : "00";
                
                String firstWord = "";
                String lastWord = "";
                if (message != null && !message.trim().isEmpty()){
                    String cleanMess = message.trim().replaceAll("[^-zA-Z]", ""); 
                    String[] words = cleanMess.split(" ");
                    if (words.length > 0){
                        firstWord = words[0];
                        lastWord = words[words.length -1];
                       }
                }
                return idPart + ":" + messageNum + ":" + (firstWord + lastWord).toUpperCase();
            }
            
            //Options: 1) Send, 0) Disregard/Delete, 3)Store.
             String handleMessAction(int choice){
                 switch(choice){
                     case 1:
                         return "Message successfully sent.";
                     case 0:
                         return "Press 0 to delete the message.";
                     case 3:
                         return "Message successfully stored.";
                     default:
                         return "Invalid choice selected.";
                 }
             }
}
