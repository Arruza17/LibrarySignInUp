package exceptions;

/**
 *
 * @author Yeray Sampedro
 */
public class FullNameGapException extends Exception {

    /**
      * Constructs a new exception with the specified detail message. Used to control the validity of the full name
     */
    public FullNameGapException() {
        super("The full name should contain the surnames too");
    }

}
