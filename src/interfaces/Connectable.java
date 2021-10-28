/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import exceptions.LoginFoundException;
import model.User;

import exceptions.ServerDownException;
import model.DataEncapsulator;

/**
 * This interface contains the methots that allow both model and logic connect
 *
 * @author Ander Arruza
 */
public interface Connectable {

    /**
     * This method signs In the user
     *
     * @param user the user to be set
     */
    public DataEncapsulator signIn(User user) throws ServerDownException, LoginFoundException;

    /**
     * This method signs Up the user
     *
     * @param user
     */
    public void signUp(User user) throws ServerDownException;

}
