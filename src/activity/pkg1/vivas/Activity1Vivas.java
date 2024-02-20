/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg1.vivas;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Activity1Vivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner scn = new
            Scanner(System.in);
    String lName, fName, mInitial, Gender;
    int age, month, day, year;
    
        System.out.println("Enter Your Last Name");
        lName = 
                scn.nextLine();
        
        System.out.println("Enter Your First Name");
        fName = 
                scn.nextLine();
        
        System.out.println("Enter Your Middle Name");
        mInitial =
                scn.nextLine();
        
        System.out.println("Enter Your Gender");
        Gender = 
                scn.nextLine();
        
        System.out.println("Enter Your Age");
        age =
                scn.nextInt();
        
        System.out.println("Enter Your Birthmonth");
        month = 
                scn.nextInt();
        
        System.out.println("Enter Your Birthdate");
        day = 
                scn.nextInt();
        
        System.out.println("Enter Your Birthyear");
        year = 
                scn.nextInt();
        
        System.out.println("Your Data: ");
        System.out.println("Last Name: " + lName);
        System.out.println("First Name: " + fName);
        System.out.println("Middle Name: " + mInitial);
        System.out.println("Gender: " + Gender);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + month + "/" + day + "/" + year);
      
    }
    
}
