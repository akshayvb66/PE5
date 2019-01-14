/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.*;
/** Write a program to implement set interface which sorts the given randomly ordered names in
 ascending order. Convert the sorted set in to an array list
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */
public class SortTheNames {
    public ArrayList<String> sortArray(HashSet<String> inputStr) {

        /*Using sets to get a ordered input string*/
        Set<String> treeSet = new TreeSet<String>(inputStr);

        /*Using Iterator to loop through the collections*/
        Iterator<String> it=treeSet.iterator();

        ArrayList<String>list1=new ArrayList<>();
            while(it.hasNext()) {
                list1.add(it.next()); }
            return list1; } }

