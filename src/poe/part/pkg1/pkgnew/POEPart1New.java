/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part.pkg1.pkgnew;
import java.util.Scanner;

/**
 *
 * @author mac
 */

     public class POEPart1New {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner st = new Scanner(System.in);
        Login loginMethod = new Login();
        // informs user to enter name,lastname, and username
        String Firstname ;
        String Lastname;
        // print out what the system says to the individual
        System.out.println("Please enter your first name:");
        Firstname = st.nextLine();
        System.out.println("Please enter your Surname:");
        Lastname = st.nextLine();
        System.out.println("Please enter your username");
        String username = st.nextLine();
        // if statments to check if all the requiremts for username are met
       if (loginMethod.checkUserName(username) == true) {
           System.out.println("Username is correct");
           System.out.println("Please enter password");
           String password = st.nextLine();
           // if statement to see if all reuiremnts for password have been met
        if ( loginMethod.checkPasswordComplexity(password) == true) {
            System.out.println("password is correct");
            System.out.println(loginMethod.registerUser(username, password));
            String userNameCheck = st.nextLine();
            System.out.println("Enter Password to login");
            String passWordcheck = st.nextLine();
            // if statement greeting the user 
            if(loginMethod.loginUser(username,password,userNameCheck,passWordcheck) == true) {
                System.out.println(loginMethod.returnLoginStatus("Sucessful login"));
                System.out.println("welcome"+ Firstname + Lastname + "its great to see you again");
            }
        }
       }
    }
    }
                    
            
       
           
       
     
        
            
        
        
    
   
     
       
      
        
       
    
       
     
        
        
       
        
 

        
        
            
        
    
    

