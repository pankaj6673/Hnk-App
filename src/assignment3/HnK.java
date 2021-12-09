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
public class HnK extends User{
    //define HnK class
    private String biographies;
    private String skills;
    private String experience;
    
    //renames each attribute so you dont have to write "this." in front of everything.
    public HnK(String email, String password, String name, String bio, String skills, String experience){
        super(email,password,name);
        this.biographies=bio;
        this.skills=skills;
        this.experience=experience;
    }
    
    //returns biographies.
    @Override
    public String getBio(){
        return "Biography: "+this.biographies+"\nSkill(s): "+this.skills+"\nExperience(s): "+this.experience;
    }
    
    //code for this written in 
    @Override
    public void setBio(String bio){
        this.biographies = bio;
    }
    
}