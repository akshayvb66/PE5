package com.stackroute.pe5testcase;

import com.stackroute.pe5.CountOccurences;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestTotalOccurences {

    CountOccurences test;

    @Before
    public void setUp() throws Exception {
        test = new CountOccurences();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test

    public void countTestSuccess() {

        String str = "one one -one___two,,three,one @three*one?two";

        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 5);
        map.put("two", 2);
        map.put("three", 2);

        assertEquals("error", map, test.findTheCounts(str));
    }

    @Test
    public void countTestSuccess1() {

        String str = "two one -two_two,,three,one @three*one?two@four";

        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 3);
        map.put("two", 4);
        map.put("three", 2);
        map.put("four", 1);

        assertEquals(map, test.findTheCounts(str));


    }

    @Test
    public void countTestFailure() {

        String str="one two three one two three one two three";

        HashMap<String, Integer> map = new HashMap<>();

        map.put("one",3);
        map.put("two",3);
        map.put("three",3);

        assertNotNull("Error",test.findTheCounts(str));

    }
}
