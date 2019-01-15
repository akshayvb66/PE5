/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.HashMap;
/** Write a program to find the number of counts in the following String . Store the output in
 Map< String ,Integer> as key value pair.
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */
public class CountOccurences {
    public HashMap<String, Integer> findTheCounts(String inputString) {

        /*Removing all the special character using removeall*/
        String result = inputString.replaceAll("[-+.^:,@___<>*?_]", " ");

        HashMap<String, Integer> find = new HashMap<>();

        /*Getting a string list*/
        String []str1=result.split(" ");

        /*Finding the count using map.put*/
        for(int i=0;i<str1.length;i++) {
            if(find.get(str1[i])==null) {
                find.put(str1[i],1); }
            else find.put(str1[i],find.get(str1[i])+1); }

        find.remove("");
        return find; }
}
