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
public class Client extends User{
    //defines class
    User assignedUser;
    
    public Client(String email, String password, String name){
        super(email,password,name);
    }
    
    public void assignToClient(User a){
        this.assignedUser = (HnK) a;
    }
    
    //returns assigned user
    public User getAssignedHnKEmployee(){return this.assignedUser;}
    
}
