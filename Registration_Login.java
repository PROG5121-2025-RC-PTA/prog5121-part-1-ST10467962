/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration_login;

import java.util.Scanner;
import java.util.regex.Pattern;
 
/**
 *
 * @author RC_Student_lab
 */
public class Registration_Login {
    
//Registration
    public static void main(String[] args) {
        Scanner scanner = new Scanner("System.in");
        
        //Username registation
            
        String username;
        while(true){
        System.out.print("Enter username(max 5 characters, must include'_'):");
        username = scanner.nextLine();
        if (username.length()<=5 && username.contains("_")){
            System.out.println("Usernaame successfully captured.");
         break;            
        }else{
            System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than five characters in length ");
        }
    }
    //Password registration
    String password= "";
    while (true){
        System.out.print("Enter password(min 8 characters,include a capital letter,number,and special character)");
        password = scanner.nextLine();
        if (password.length() >= 8 &&
    Pattern.compile("[A-Z]").matcher(password).find() &&
    Pattern.compile("[0-9]").matcher(password).find() &&
    Pattern.compile("[@#$%*]").matcher(password).find()) {

            
            System.out.println("password successfully captured.");
            break;
        }else{
        System.out.println("Invalid password.Make sure it has 8 characters,one uppercase, one number, and one special characters.");
        }
    }
         //Cell Phone registarion
        String cellphone;
         while(true){
             System.out.print("Enter cellphonenumber(must start with +27 and have 9 digits after):");
             cellphone = scanner.nextLine();
           // if(cellphone.startsWith("+27")&& cellphone.length()==12 && cellphone.substring
             System.out.println("cellphone accepted.");
             break;
        // }else{
           //System.out.println("Invalid cellphone number.It must start with +27 and cotain 9 digits after.");
         }
          scanner.close();           
         }
        
         }
    
                    
            
        
                
                
    

