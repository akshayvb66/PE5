import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMoodify {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");

        System.out.println(fruits);

        System.out.println("Enter what you want to add ");


        String s=scan.nextLine();

        String s2= scan.nextLine();


        ArrayMoodify obj= new ArrayMoodify();

        System.out.println(obj.updateArray(fruits,s,0));
        System.out.println(obj.updateArray(fruits,s2,2));

        System.out.println("String removed all elements "+obj.RemoveList(fruits));
    }

    public ArrayList<String> updateArray(ArrayList<String> a,String c,int b){

        a.remove(b);
        a.add(b,c);

        return a;
    }

    public ArrayList<String> RemoveList(ArrayList<String> a){

        a.removeAll(a);
        return a;

    }
}
