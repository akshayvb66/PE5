package com.stackroute.pe5testcase;

import com.stackroute.pe5.CheckForMultipleOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckForMultipleOccurenceTest {
    CheckForMultipleOccurence test;

    @Before
    public void setUp() throws Exception {
        test= new CheckForMultipleOccurence();
    }

    @After
    public void tearDown() throws Exception {
    test = null;
    }

    @Test
    public void testBoolean1() {
        String  arr[] = {"a","b","c","e","a","c","c","d"};

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        map.put("e",false);

        assertEquals("Error",map,test.stringCount(arr));
    }
    @Test
    public void booleanTest2() {


        String  arr[] = {"a","a","a","b","b","b","b","b","c","d"};

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("a",true);
        map.put("b",true);
        map.put("c",false);
        map.put("d",false);

        assertEquals("Error",map,test.stringCount(arr));
    }
    @Test
    public void stringBooleanFailure() {

        String  arr[] = {"a","a","a","b","b","b","b","b","c"};

        assertNotNull("Error",test.stringCount(arr));
    }

}