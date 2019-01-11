/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.pe5;
import java.util.*;
/** This program updates the values of keys of the map
 *
 *  @version 1.0 11-1-2018
 *
 *  @author Akshay Badiger
 *
 */
public class ChangeMapValues {
    public LinkedHashMap<String,String > changevalues(LinkedHashMap<String,String>inputmap){
        Iterator itr = inputmap.entrySet().iterator();
        Map.Entry m1 = (Map.Entry)itr.next();
        String key1=(String)m1.getKey();
        String value1=(String)m1.getValue();

        m1 = (Map.Entry)itr.next();
        String key2=(String)m1.getKey();
        String value2=(String)m1.getValue();

        if(value1!=null) {
            inputmap.put(key1," ");
            inputmap.put(key2,value1);
        }
        return inputmap;}
}
