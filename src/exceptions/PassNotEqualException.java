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
public class PassNotEqualException extends Exception{
    /**
     * Exception used to warn about passwordFields not being equal.
     */
    public PassNotEqualException() {
      super("Password fields are not the same");
    }
    
}
