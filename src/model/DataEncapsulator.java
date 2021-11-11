package model;

import java.io.Serializable;

/**
 * This class allows the sending of DataEncapsulator
 *
 * @author Ander Arruza
 */
public class DataEncapsulator implements Serializable {

    private User user;
    private Exception exception;
    
    /**
     * Empty constructor for DataEncapsulator
     */
    public DataEncapsulator() {
        
    }

    /**
     * This constructor contains all the fields to be set 
     * @param user the user to set 
     * @param exception an Exception to set
     */
    public DataEncapsulator(User user, Exception exception) {
        this.user = user;
        this.exception = exception;
    }
    
    /**
     * Gets the user
     * @return the User to get
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets the Exception
     * @return the Exception to get
     */
    public Exception getException() {
        return exception;
    }

    /**
     * Sets the Exception
     * @param exception the Exception to set
     */
    public void setException(Exception exception) {
        this.exception = exception;
    }


}
