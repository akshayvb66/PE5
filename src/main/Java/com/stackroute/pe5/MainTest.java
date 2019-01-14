/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/** Create a Student class that represents the following information of a student: id, name, and age all
 the member variables should be private .
 a. Implement `getter and setter` .
 b. Create a `StudentSorter` class that implements `Comparator interface` .
 c. Write a class `Maintest` create Student class object(minimum 5)
 d. Add these student object into a List of type Student .
 e. Sort the list based on their age in decreasing order, for student having same
 age, sort based on their name
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */

public class MainTest {
    public List<Student> sortStudents(List<Student> students) {

        String str="";

        /*Sorting the students using StudentSorter*/
        Collections.sort(students,new StudentSorter());


        /*Using Iterator to loop through the collections*/
        Iterator it1 = students.iterator();

        while (it1.hasNext()) {
            Student element = (Student) it1.next(); }
        return students; }
}