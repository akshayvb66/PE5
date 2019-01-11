import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.temporal.JulianFields;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ChangeMapValuesTest {

    @Before
    public void setUp() throws Exception {
        ChangeMapValues test = new ChangeMapValues();
    }

    @After
    public void tearDown() throws Exception {
        changeMapValues = null;
    }

    ChangeMapValues changeMapValues;


    @Test
    public void TestValueChange1() {
        ChangeMapValues test = new ChangeMapValues();

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1","java");
        hm.put("val2","c++");

        HashMap<String, String> res = new HashMap<>();

        res.put("val1"," ");
        res.put("val2","java");

        assertEquals("Error",res, test.ChangeValues(hm)); }

    @Test
    public void TestValueChange2(){

        ChangeMapValues test = new ChangeMapValues();

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1", "Akshay");
        hm.put("val2", "Badiger");

        HashMap<String, String> res = new HashMap<>();

        res.put("val1", " ");
        res.put("val2", "Akshay");

        assertEquals("Error", res, test.ChangeValues(hm));
    }

    @Test
    public void modifyFailure() {
        ChangeMapValues test = new ChangeMapValues();

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1", "Akshay");
        hm.put("val2", "Badiger");

        assertNotNull("Error",test.ChangeValues(hm));

    }

}