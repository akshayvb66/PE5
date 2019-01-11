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

/** This class checks for multiple occurences of word in a string array and returns boolean
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */

public class CheckForMultipleOccurence {
    public HashMap<String, Boolean> stringCount(String[] str) {
        HashMap<String, Boolean> count = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (count.containsKey(str[i])) {
                count.put(str[i], true);
            } else
                count.put(str[i], false);}
        count.remove("");
        return count; }
}

