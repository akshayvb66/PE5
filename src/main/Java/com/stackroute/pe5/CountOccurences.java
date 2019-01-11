/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Scanner;
/** This class takes the input string and counts the number of times of each word had appeared
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */
public class CountOccurences {
    public HashMap<String, Integer> findTheCounts(String input) {
        String result = input.replaceAll("[-+.^:,@___<>*?_]", " ");
        HashMap<String, Integer> find = new HashMap<>();
        String []str1=result.split(" ");
        for(int i=0;i<str1.length;i++) {
            if(find.get(str1[i])==null) {
                find.put(str1[i],1); }
            else find.put(str1[i],find.get(str1[i])+1); }
        find.remove("");
        return find; }
}
