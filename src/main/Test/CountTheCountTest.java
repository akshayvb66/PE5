import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CountTheCountTest {

    @Before
    public void setUp() throws Exception {
        CountTheCount test = new CountTheCount();
    }

    @After
    public void tearDown() throws Exception {
        countTheCount = null;
    }

    CountTheCount countTheCount;

    @Test

    public void CountTestSuccess() {

        CountTheCount test = new CountTheCount();

        String str = "one one -one___two,,three,one @three*one?two";

        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 5);
        map.put("two", 2);
        map.put("three", 2);

        assertEquals("error", map, test.FindTheCounts(str));
    }

    @Test
    public void CountTestSuccess1() {

        String str = "two one -two_two,,three,one @three*one?two@four";

        CountTheCount test = new CountTheCount();

        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 3);
        map.put("two", 4);
        map.put("three", 2);
        map.put("four", 1);

        assertEquals(map, test.FindTheCounts(str));


    }

    @Test
    public void CountTestFailure() {

        CountTheCount test = new CountTheCount();

        String str="one two three one two three one two three";

        HashMap<String, Integer> map = new HashMap<>();

        map.put("one",3);
        map.put("two",3);
        map.put("three",3);

        assertNotNull("Error",test.FindTheCounts(str));

    }
}
