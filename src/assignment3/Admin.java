/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Admin extends User{
    //Scanner is needed to input an array instead of a single variable...i think. But you dont even need to understand this line anyways.
    Scanner input = new Scanner(System.in); 
    //defines Admin
    public Admin(String email, String password, String name){
        super(email,password,name);
    }
    //deletes user
    public void deleteUser(String userEmail){
        super.removeUser(userEmail);
    }

    
}
