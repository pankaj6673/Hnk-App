/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class UserTest {
    
    /**
     * Test of getSizeArray method, of class User.
     */
    @Test
    public void testGetSizeArray() {
        System.out.println("getSizeArray");
        User instance = new User();
        int expResult = 0;
        int result = instance.getSizeArray();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBio method, of class User.
     */
    @Test
    public void testGetBio() {
        System.out.println("getBio");
        User instance = new User();
        String expResult = null;
        String result = instance.getBio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBio method, of class User.
     */
    @Test
    public void testSetBio() {
        System.out.println("setBio");
        String bio = "";
        User instance = new User();
        instance.setBio(bio);
        
    }

    /**
     * Test of getUser method, of class User.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        int userid = 0;
        User instance = new User();
        User test = new Admin("test","test","test");
        instance.users.add(test);
        User expResult = test;
        User result = instance.getUser(userid);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of insertUser method, of class User.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User user = null;
        User instance = new User();
        instance.insertUser(user);
        
    }

    /**
     * Test of getUserList method, of class User.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        User instance = new User();
        ArrayList<User> expResult = new ArrayList<>();
        ArrayList<User> result = instance.getUserList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User("test","test","test");
        String expResult = "test";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeUser method, of class User.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        String email = "";
        User instance = new User();
        instance.removeUser(email);
        
    }

    

    /**
     * Test of searchUserByEmail method, of class User.
     */
    @Test
    public void testSearchUserByEmail() {
        System.out.println("searchUserByEmail");
        String email = "test";
        User instance = new User();
        User test = new Admin("test","test","test");
        instance.users.add(test);
        User expResult = test;
        User result = instance.searchUserByEmail(email);
        assertEquals(expResult, result);
        
    }
    
}
