//Malia Moreno | 17 January 2025//
package com.mycompany.u5l3methoddesignassignment;
import java.util.*;

public class U5L3MEthodDesignAssignment {
    public static void main(String[] args) {
        
        
        System.out.println("I Work!");
    }
}


//Make Student Class - set name and create courses//
class Student{
    //setting all variables//
    private String firstName, lastName;
    
    //constructor class//
    public Student(){
        firstName = "";
        lastName = "";
    }
    public Student(String first, String last){
        firstName = first;
        lastName = last;
    }
    
    //soString method//
    @Override
    public String toString(){
        String result;
        result = firstName + " " + lastName + "\n";
        return result;
    }
}

//Make Courses Class - setting and getting test scores and averages//
