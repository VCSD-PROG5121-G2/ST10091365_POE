/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe.part.pkg1.pkgnew;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class LoginTest {
    Login obj= new Login();
    public LoginTest() {
        
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
       String checkA =  "Tes_";
       boolean checku =obj.checkUserName(checkA);
       assertEquals(true,checku);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    
    @Test
    public void testCheckPasswordComplexity() {
        String pass1 ="Bulu_@1233";
        boolean checkpass = obj.checkPasswordComplexity(pass1);
        assertEquals(true,checkpass); 
    }

    /**
     * Test of registerUser method, of class Login.
     */
    /*
    @Test
    public void testRegisterUser() {
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    /*
    @Test
    public void testReturnLoginStatus() {
    }
    */
}
