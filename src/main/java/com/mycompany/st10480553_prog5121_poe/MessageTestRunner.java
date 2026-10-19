/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10480553_prog5121_poe;

/**
 *
 * @author dulcy
 */
public class MessageTestRunner {
    public static void main(String[] args){
        Message message = new Message();
        
        System.out.println("Running Message Validation Tests.");
        
        //Test 1: Valid Message ID
        boolean test1 = message.checkMessID("ID12345");
        System.out.println("Test 1 (Valid MessID): " + (test1 ? "PASSED": "FAILLED"));
        
        //Test 2: Valid Message ID (too long)
        boolean test2 = message.checkMessID("ThisIDIsWayTooLong12345");
        System.out.println("Test 2 (Invalid MessID): " + (test2 ? "PASSED": "FAILLED"));
        
        //Test 3: Valid Cell number
        String cellResult1 = message.checkRecCell("+27123456789");
        System.out.println("Test 3 (Valid Cell): " + cellResult1);
        
        //Test 4: Invalid cell number
        String cellResult2 = message.checkRecCell("12345");
        System.out.println("Test 4 (Invalid Cell): " + cellResult2);
        
        //Test 5: Message Hash
        String hash = message.createMessHash("ID1", 0, "Test message content");
        System.out.println("Test 5 (Message Hash): " + (hash != null ? "PASSED (Hash: "+ hash +")": "FAILLED"));
    }
}
