/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/** This java class takes the student list and sorts them in decreasing order of age
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */

public class MainTest {
    public List<Student> sortStudents(List<Student> students) {
        String str="";
        Collections.sort(students,new StudentSorter());
        Iterator it1 = students.iterator();
        while (it1.hasNext()) {
            Student element = (Student) it1.next(); }
        return students; }
}