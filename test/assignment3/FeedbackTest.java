/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

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
public class FeedbackTest {

    /**
     * Test of printAllFeedbacks method, of class Feedback.
     */
    @Test
    public void testPrintAllFeedbacks() {
        System.out.println("printAllFeedbacks");
        Feedback instance = new Feedback();
        instance.printAllFeedbacks();
        
    }

    /**
     * Test of insertFeedback method, of class Feedback.
     */
    @Test
    public void testInsertFeedback() {
        System.out.println("insertFeedback");
        String content = "";
        Feedback instance = new Feedback();
        instance.insertFeedback(content);
        
    }
    
}
