package exceptions;

import model.User;

/**
 *
 * @author Yeray Sampedro
 */
public class UserNotFoundException extends Exception{
    
    /**
     * Constructs a new exception with the specified detail message. Used to control email format validity
     */
    public UserNotFoundException(){
        super("Login or password are incorrect");
    }
           
}
