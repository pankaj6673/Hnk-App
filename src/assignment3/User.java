/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class User implements UserInterface{
    //define User class
    private String email;
    private String password;
    private String name;
    ArrayList<User> users;
    
    
    //add another index to the arraylist(arraylist keeps a track of the number of users)
    public User(){
        users = new ArrayList<>();
    }
    
    //user inputs when a new user is made
    public User(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }
    
    
    //returns the total number of users
    public int getSizeArray(){return this.users.size();}

    //Biography functions are written in HnKEmployee, so is empty for now
    public String getBio(){return null;}
    public void setBio(String bio){}
    
    
    //get user by id
    public User getUser(int userid){
        return this.users.get(userid);
    }
    
    //adds a user
    public void insertUser(User user){
        this.users.add(user);
    }
    
    
    //return all users
    public ArrayList<User> getUserList(){return this.users;}
    
    
    //get email
    public String getEmail(){return this.email;}
    
    //remove user
    @Override
    public void removeUser(String email){
        int user = 0;
        for(User counter : this.users){
            if(email.equals(counter.getEmail()))
            {
                this.users.remove(user);
                break;
            }
            user++;
        }
    }
    
    
    //add a user
    @Override
    public void addUserToArray(){
        User newUser = null;
        Scanner input = new Scanner(System.in);
        System.out.println("\nUser department: A - Admin, C - Client, H - HnK Employee ");
        String dep = input.nextLine();
        System.out.print("User name: ");
        String newName = input.nextLine();
        System.out.print("User email: ");
        String newEmail = input.nextLine();
        System.out.print("User password: ");
        String newPassword = input.nextLine();
        
        if(!"A".equals(dep)) if("C".equals(dep)) newUser = new Client(newEmail,newPassword,newName);
        else if("H".equals(dep)) {
            System.out.print("Insert biography: ");
            String newBio = input.nextLine();
            System.out.print("Insert skills: ");
            String newSkills = input.nextLine();
            System.out.print("Insert experiences: ");
            String newExperience = input.nextLine();
            newUser = new HnK(newEmail,newPassword,newName,newBio,newSkills,newExperience);
        }
        else newUser = new Admin(newEmail,newPassword,newName);
        
        this.users.add(newUser);
    }
    
    //returns a user searched by email
    @Override
    public User searchUserByEmail(String email){
        int foundID = 0;
        boolean found = false;
        for (User search : users){
            if(search.getEmail().equals(email)){//'Critical evaluation': this could be improved making sure
                found = true;
                break;
            }
            foundID++;
        }
        if(found)
            return this.users.get(foundID);
        else 
            return null;
    }
}