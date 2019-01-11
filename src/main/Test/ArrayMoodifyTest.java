import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayMoodifyTest {

    ArrayMoodify test;

    @Before
    public void setUp() throws Exception {
    test = new ArrayMoodify();
    }


    @After
    public void tearDown() throws Exception {
        test= null;
    }

    @Test

    public void TestUpdateSuccess(){

        ArrayList<String> list=new ArrayList<String >();

        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");

        ArrayList<String>list1=new ArrayList<String>();

        list1.add("Apple");
        list1.add("Grape");
        list1.add("kiwi");
        list1.add("Berry");
        list1.add("orange");

        assertEquals("Error",list1,test.updateArray(list,"kiwi",2));

    }

    @Test

    public void TestUpdateSuccess1(){

        ArrayList<String> list=new ArrayList<String >();

        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");

        ArrayList<String>list1=new ArrayList<String>();

        list1.add("Apple");
        list1.add("Grape");
        list1.add("kiwi");
        list1.add("Berry");
        list1.add("orange");

        assertEquals("Error",list1,test.updateArray(list,"kiwi",2));

    }

    @Test
    public void updateFailure() {

        ArrayMoodify test = new ArrayMoodify();

        ArrayList<String> list=new ArrayList<String >();

        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");

        assertNotNull("Error",test.updateArray(list,"kiwi",0));

    }
    @Test
    public void remove() {
        ArrayList<String> list=new ArrayList<String >();

        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");

        ArrayList<String>list1=new ArrayList<String >();

        assertEquals("Error",list1,test.RemoveList(list));

    }
}