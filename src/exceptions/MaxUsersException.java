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
public class MaxUsersException extends Exception{
    /**
     * Exception used to warn about max limit of users being already reacherd.
     */
    public MaxUsersException() {
        super("Max user limit reached, please try again later.");
    }
    
}
