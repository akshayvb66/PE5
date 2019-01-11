import java.util.*;

public class ChangeMapValues {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        {
            map.put("Val1", "java");
            map.put("val2", "c++");
        }


        ChangeMapValues obj = new ChangeMapValues();
        System.out.println(obj.ChangeValues(map));


        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        {
            map1.put("Val1", "mars");
            map1.put("val2", "saturn");
        }

        ChangeMapValues obj1 = new ChangeMapValues();
        System.out.println(obj1.ChangeValues(map1));
    }


    public LinkedHashMap<String,String >ChangeValues(LinkedHashMap<String,String>inputmap)
    {
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
        return inputmap;

    }
}
