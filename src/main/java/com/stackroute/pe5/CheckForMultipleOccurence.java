/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;

import java.util.HashMap;

/** Write a program where an array of strings is input and output is a Map< String ,boolean> where
 each different string is a key and its value is true if that string appears 2 or more times in the array
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */

public class CheckForMultipleOccurence {

    public HashMap<String, Boolean> stringCount(String[] inputString) {

        HashMap<String, Boolean> count = new HashMap<>();

        /*Using map to assign true or false based on their occurences*/
        for (int i = 0; i < inputString.length; i++) {
            if (count.containsKey(inputString[i])) {
                count.put(inputString[i], true);
            } else
                count.put(inputString[i], false);}

        count.remove("");
        return count; }
}

