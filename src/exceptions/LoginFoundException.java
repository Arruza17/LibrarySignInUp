/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Jorge_Crespo
 */
public class LoginFoundException extends Exception{
    /**
     * Exception used to warn about login being already registered in the database.
     */
    public LoginFoundException() {
        super("Login field is already registered. Change the value of login field.");
    }
    
}
