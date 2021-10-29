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
public class ServerDownException extends Exception {

    /**
     * Constructs a new exception with the specified detail message. Used to
     * control if the server is down
     */
    public ServerDownException() {
        super("The server is down, try connecting again in a few minutes");
    }

    public ServerDownException(String msg) {
        super(msg);
    }
}
