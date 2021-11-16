/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Yeray Sampedro
 */
public class PasswordFormatException extends Exception{

    public PasswordFormatException() {
        super("Password format error: Passwords should not contain spaces");
    }
    
}
