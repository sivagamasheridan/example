/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2example;

/**
 * array of objects
 * @author srinivsi
 */
public class Week2Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //array store 5 students details
        Student[] list = new Student[5]; // array of object declaration
        Student s1= new Student();
        s1.setName("John");
        s1.setAge(21);
        list[0]=s1; //saved the object in an array
        System.out.println(s1.getName() + " "+ s1.getAge());
    }
    
}
