/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part.pkg1.pkgnew;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author mac
 */
public class Login {
    
// boelean to check username
    public boolean checkUserName(String checku){
        //if statement for username conditons
        return checku.contains("_")&& checku.length()<=5;
        }
    
//boelean to check password
    public boolean checkPasswordComplexity(String checkpass){
       
        String Characters = ("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
        Pattern p = Pattern.compile(Characters);
        Matcher m = p.matcher(checkpass);
        // if statement for password conditions 
        if (checkpass.length()>=8) {
            return true;
        }
        if (m.matches() == true) {
            return true;
        } else {
            return false;
        }
    } 
    public String registerUser( String Username, String checkpass){
        // if statement compairing check username and checkpassword 
        
        if (checkUserName(Username) == true && checkPasswordComplexity(checkpass)== true) {
            return "User has suceesfuuly loged in";
        }else if 
         (checkUserName(Username) == false && checkPasswordComplexity(checkpass)== true) {
            return "Username is not correctly formated," + 
                    "Please ensure that your username contains an underscore and is no more than 5 characters in length ";
       
        }else if(checkUserName(Username) == true && checkPasswordComplexity(checkpass)== false) 
            return "Password is not correcctly formated"+ 
           "Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
    
else {
            return "User has succesfully logedin";
        }
    }
     public String returnLoginStatus(String submit) {
         
         if (equals("sucess"))
             return "Login was successful"; 
             else {
             return "Login was unsuccessful";
        }
     }     

    boolean loginUser(String username, String password, String userNameCheck, String passWordcheck) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   }

