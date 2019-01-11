import java.util.HashMap;
import java.util.Scanner;

public class CountTheCount {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String s=scan.nextLine();

        CountTheCount obj= new CountTheCount();

        System.out.println(obj.FindTheCounts(s));
    }



    public HashMap<String, Integer>FindTheCounts(String str) {

        String result = str.replaceAll("[-+.^:,@___<>*?_]", " ");

        HashMap<String, Integer> find = new HashMap<>();

        String []str1=result.split(" ");

        for(int i=0;i<str1.length;i++)
        {

            if(find.get(str1[i])==null)
            {
                find.put(str1[i],1);
            }
            else
                find.put(str1[i],find.get(str1[i])+1);
        }
        find.remove("");
        return find;
    }

}
