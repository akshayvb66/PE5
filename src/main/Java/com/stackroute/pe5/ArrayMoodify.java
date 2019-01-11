/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.ArrayList;

/** Java program to update specific array element by given element and empty the array list
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */
public class ArrayMoodify {

    public ArrayList<String> updateArray(ArrayList<String> string,String replacement,int index){
        string.remove(index);
        string.add(index,replacement);
        return string;}

    public ArrayList<String> removeList(ArrayList<String> string){
        string.removeAll(string);
        return string; }
}
