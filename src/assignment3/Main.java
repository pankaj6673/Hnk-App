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
public class Main {

public static void main(String[] args) {
        // TODO code application logic here
        User users = new User();
        Feedback feeds = new Feedback();
        User newUser;
        User activeUser = null;
        System.out.println("How many users would you like to insert: ");
        Scanner input = new Scanner(System.in); 
        int numberOfUsers = Integer.parseInt(input.nextLine());
        String userDep;
        //CREATE USER DATABASE. 'Critical evaluation': the user could have been retrieved from a file or a database
        for(int i=0;i<numberOfUsers;i++){
            System.out.println("\nUser department: A - Admin, C - Client, H - HnK Employee ");
            userDep = input.nextLine();
            System.out.print("User name: ");
            String name = input.nextLine();
            System.out.print("User email: ");
            String email = input.nextLine();
            System.out.print("User password: ");
            String password = input.nextLine();
            switch(userDep){
                case "A":
                    newUser = new Admin(email,password,name);
                    users.insertUser(newUser);
                    break;
                case "C":
                    newUser = new Client(email,password,name);
                    users.insertUser(newUser);
                    break;
                case "H":
                    System.out.print("Insert biography: ");
                    String bio = input.nextLine();
                    System.out.print("Insert skills: ");
                    String skills = input.nextLine();
                    System.out.print("Insert experiences: ");
                    String experience = input.nextLine();
                    newUser = new HnK(email,password,name,bio,skills,experience);
                    users.insertUser(newUser);
                    break;
                default: 
                    System.out.println("Input error. User not inserted.");
                    numberOfUsers++;
                    break;
                }
            }
            //LOGIN
            boolean cont = true;
            while(cont = true){
                System.out.println("\nLogin with your credentials.\n");
                boolean found = false;
                do{
                System.out.println("Enter email: ");
                String userEmail = input.nextLine();
                System.out.println("Enter password: ");
                String userPassword = input.nextLine();
                int foundID = 0;
                for (User search : users.getUserList()){
                    if(search.getEmail().equals(userEmail)){//'Critical evaluation': this could be improved making sure
                        activeUser = users.getUser(foundID);
                        found = true;
                        break;
                    }
                    foundID++;
                }
                if(foundID == users.getSizeArray())System.out.println("No user found. Try again.");
                }while(!found);
                //Actions
                if(activeUser instanceof Admin)
                {
                    System.out.println("\nActions permitted:\nA - Add user\nD - Delete user\nS - See feedbacks\nT - Terminate program");
                    String actionPerformed = input.nextLine();
                    switch(actionPerformed){
                        case "A":
                            users.addUserToArray();
                            break;
                        case "D":
                            System.out.println("\nEnter email of the user to delete:");
                            String deleteUser = input.nextLine();
                            users.removeUser(deleteUser);
                            break;
                        case "S":
                            feeds.printAllFeedbacks();
                            break;
                        case "T":
                            System.exit(0);
                            //Program terminated.
                        default:
                            System.out.println("\nActions not permitted.");
                            break;
                    }
                }
                else if(activeUser instanceof Client)
                {
                    System.out.println("\nActions permitted:\nI - Insert feedbacks\nB - See biographies\nA - Assign HnK Employee\nT - Terminate program");
                    String actionPerformed = input.nextLine();
                    switch(actionPerformed){
                        case "I":
                            System.out.println("Insert feedback: ");
                            String content = input.nextLine();
                            feeds.insertFeedback(content);
                            System.out.println("Done");
                            break;
                        case "B":
                            System.out.println("\nEnter user email to be searched for the bio, skills and experiences: ");
                            String searchUserEmail = input.nextLine();
                            System.out.println(searchUserEmail+" "+users.users.get(1).getEmail()+" "+users.getSizeArray());
                            User searchBio = users.searchUserByEmail(searchUserEmail);
                            if(searchBio == null)
                                System.out.println("\nUser not found try again.\n");
                            else
                                System.out.println(searchBio.getBio());
                            break;
                        case "A":
                            System.out.println("\nEnter user email to be assigned to you(Client): ");
                            String assignedUserEmail = input.nextLine();
                            User assigned = users.searchUserByEmail(assignedUserEmail);
                            if(assigned == null)
                                System.out.println("\nUser not found try again.\n");
                            else
                                ((Client) activeUser).assignToClient(assigned);
                            break;
                        case "T":
                            System.exit(0);
                            //Program terminated.
                        default:
                            System.out.println("\nActions not permitted.");
                            break;
                    }
                }
                else if(activeUser instanceof HnK)
                {
                    System.out.println("\nActions permitted:\nI - Insert feedbacks\nB - See biographies\nE - Edit biography\nT - Terminate program");
                    String actionPerformed = input.nextLine();
                    switch(actionPerformed){
                        case "I":
                            System.out.println("Insert feedback: ");
                            String content = input.nextLine();
                            feeds.insertFeedback(content);
                            System.out.println("Done");
                            break;
                        case "B":
                            System.out.println("\nEnter user email to be searched for the bio, skills and experiences: ");
                            String searchUserEmail = input.nextLine();
                            System.out.println(searchUserEmail+" "+users.users.get(1).getEmail()+" "+users.getSizeArray());
                            User searchBio = users.searchUserByEmail(searchUserEmail);
                            if(searchBio == null)
                                System.out.println("\nUser not found try again.\n");
                            else
                                System.out.println(searchBio.getBio());
                            break;
                        case "E":
                            System.out.println("Insert new bio: ");
                            String bio = input.nextLine();
                            activeUser.setBio(bio);
                            break;
                        case "T":
                            System.exit(0);
                            //Program terminated.
                        default:
                            System.out.println("\nActions not permitted.");
                            break;}
                    }
            }
    }
    
}
