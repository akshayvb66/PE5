/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.*;
/** This class takes the input string and sorts them in ascending order of alphabets
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */
public class SortTheNames {
    public ArrayList<String> sortArray(HashSet<String> inputStr) {
            Set<String> treeSet = new TreeSet<String>(inputStr);
            Iterator<String> it=treeSet.iterator();
            ArrayList<String>list1=new ArrayList<>();
            while(it.hasNext()) {
                list1.add(it.next()); }
            return list1; } }

