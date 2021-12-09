/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author User
 */
public interface UserInterface {
    public void removeUser(String email);
    
    public void addUserToArray();
    
    public User searchUserByEmail(String email);
}

