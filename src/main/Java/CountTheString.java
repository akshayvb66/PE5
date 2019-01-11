import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheString {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements");

        int num=scan.nextInt()+1;

        String[] str = new String[num];

        for(int i=0;i<num;i++) {
            str[i] = scan.nextLine();
        }


        CountTheString obj = new CountTheString();

            System.out.println(obj.StringCount(str));

    }

    public HashMap<String, Boolean> StringCount(String[] str) {


        HashMap<String, Boolean> count = new HashMap<>();


        for (int i = 0; i < str.length; i++) {

            if (count.get(str[i]) == null) {
                count.put(str[i], false);
            } else
                count.put(str[i], true);
        }

        count.remove("");

        return count;


    }
}

