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
public class FieldsEmptyException extends Exception{
/**
 * Exception used to warn about a field being empty.
 */
    public FieldsEmptyException() {
        super("At least one field is empty.");
    }
    
}
