package com.stackroute.pe5testcase;

import com.stackroute.pe5.ChangeMapValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ChangeMapValuesTest {

    ChangeMapValues test;

    @Before
    public void setUp() throws Exception {
        test = new ChangeMapValues();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }


    @Test
    public void TestValueChange1() {

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1","java");
        hm.put("val2","c++");

        HashMap<String, String> res = new HashMap<>();

        res.put("val1"," ");
        res.put("val2","java");

        assertEquals("Error",res, test.changevalues(hm)); }

    @Test
    public void TestValueChange2(){

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1", "Akshay");
        hm.put("val2", "Badiger");

        HashMap<String, String> res = new HashMap<>();

        res.put("val1", " ");
        res.put("val2", "Akshay");

        assertEquals("Error", res, test.changevalues(hm));
    }

    @Test
    public void ModifyFailure() {

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1", "Akshay");
        hm.put("val2", "Badiger");

        assertNotNull("Error",test.changevalues(hm));

    }

}