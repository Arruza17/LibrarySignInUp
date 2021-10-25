/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumerations.UserPrivilege;
import enumerations.UserStatus;
import java.io.Serializable;
import java.security.Timestamp;

/**
 *
 * @author Adrian perez
 */
public class User implements Serializable{
    
   
    private int id;
    private String login;
    private String email;
    private String fullName;
    private UserStatus status;
    private UserPrivilege privilege;    
    private String password;
    private Timestamp lastPasswordChange;
    private static User user;
    
   
    /**
     * Getter of the user that creates a unique instance of User
     * @return 
     */
    public static User getUser(){
        
        if(user==null){
            user=new User();
        }
        
        return user;                  
    }
    
     /**
     * Empty constructor of the user.
     */
    
    private User(){
        
    }

    /**
     * Gets the user's id.
     * @return id - The id of the User
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the user's id.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the user's login username.
     * @return login - user's username.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the user's username.
     * @param login - user's username.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Gets user's email.
     * @return email - user's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets user's email.
     * @param email - user's email.
     */
    
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets user's full name.
     * @return fullname - User's full name.
     */
    
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets user's full name.
     * @param fullName 
     */
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /**
     * Gets the current status of the user.
    * @return 
    */
    public Enum getStatus() {
        return status;
    }

    /**
     * Sets user's status.
     * @param status - user's status. 
     */
    
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * Gets user's privilege.
     * @return privilege - user's privilege.
     */
    
    public Enum getPrivilege() {
        return privilege;
    }

    /**
     *Sets user's privilege
     * @param privilege - user's privilege.
     */
    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    /**
     * Gets user's password. 
     * @return password - user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets user's password.
     * @param password - user's password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets user's last password change.
     * @return lastPasswordChange - user's last password change.
     */
    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    /**
     * Sets user's last password change. 
     * @param lastPasswordChange - user's last password change.
     */
    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    
    }
        
/**
 * to string method that returns all the values of the attributes.
 * @return returns all the values of the attributes in a String.
 */
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", email=" + email + ", fullName=" + fullName + ", status=" + status + ", privilege=" + privilege + ", password=" + password + ", lastPasswordChange=" + lastPasswordChange + '}';
    }
    
    
    
}

   
