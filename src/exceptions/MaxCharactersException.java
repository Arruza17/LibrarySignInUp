package exceptions;

/**
 *
 * @author Yeray Sampedro
 */
public class MaxCharactersException extends Exception{

    /**
     *Constructs a new exception with the specified detail message. Used to control that the characters are not more than 255
     */
    public MaxCharactersException() {
        super("The maximum amount of characters is 255, try again with shorter information");
    }
    
}
