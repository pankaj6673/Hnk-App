/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Feedback implements FeedbackInterface {
    //defines Feedback class
    private String content;
    ArrayList<Feedback> feeds;
    
    //adds a new value to the arraylist. the arraylist tracks the total number of feedbacks.
    public Feedback(){
        feeds = new ArrayList<>();
    }
    
    //renames this.content to just content cause its easier to code that way.
    public Feedback(String content){
        this.content = content;
    }
    
    //prints all feedbacks
    @Override
    public void printAllFeedbacks(){
        for(int i=0;i<this.feeds.size();i++)
            System.out.println(this.feeds.get(i).content);
    }
    
    //adds a new feedback
    @Override
    public void insertFeedback(String content)
    {
        Feedback a = new Feedback(content);
        this.feeds.add(a);
    }
}
