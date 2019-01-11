import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountTheStringTest {

    @Before
    public void setUp() throws Exception {
        CountTheString test= new CountTheString();
    }

    @After
    public void tearDown() throws Exception {
    countTheString = null;
    }

    CountTheString countTheString;

    @Test
    public void TestBoolean1() {
        CountTheString test= new CountTheString();

        String  arr[] = {"a","b","c","e","a","c","c","d"};

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        map.put("e",false);

        assertEquals("Error",map,test.StringCount(arr));
    }
    @Test
    public void BooleanTest2() {

        CountTheString test= new CountTheString();

        String  arr[] = {"a","a","a","b","b","b","b","b","c","d"};

        HashMap<String, Boolean> map = new HashMap<>();

        map.put("a",true);
        map.put("b",true);
        map.put("c",false);
        map.put("d",false);

        assertEquals("Error",map,test.StringCount(arr));
    }
    @Test
    public void StringBooleanFailure() {

        CountTheString test= new CountTheString();

        String  arr[] = {"a","a","a","b","b","b","b","b","c"};

        assertNotNull("Error",test.StringCount(arr));
    }

}