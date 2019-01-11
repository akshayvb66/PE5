import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SortTheNamesTest {

    @Before
    public void setUp() throws Exception {
       SortTheNames test = new SortTheNames();

    }

    @After
    public void tearDown() throws Exception {
        sortTheNames= null;
    }

    SortTheNames sortTheNames;

    @Test
    public void TestSorting1() {

        SortTheNames test = new SortTheNames();

        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals("Error",arr,test.sortArray(set));
    }
    @Test
    public void TestSorting2() {
        SortTheNames test = new SortTheNames();

        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Kevin");
        set.add("Peterson");

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Kevin");
        arr.add("Olive");
        arr.add("Peterson");
        assertEquals("Error",arr,test.sortArray(set));
    }
    @Test
    public void SortingFailure() {
        SortTheNames test = new SortTheNames();

        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Akshay");
        set.add("Badiger");

        assertNotNull("Error",test.sortArray(set));

    }
}