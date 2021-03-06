package exceptions;

/**
 * This exception is used in case minimum character limit isn't reached.
 * @author Yeray Sampedro
 */
public class PassMinCharacterException extends Exception{

    /**
     *  Constructs a new exception with the specified detail message. Used to control that the password characters are at least 6
     */
    public PassMinCharacterException() {
        super("The password needs to have at least 6 characters");
    }
    
}
