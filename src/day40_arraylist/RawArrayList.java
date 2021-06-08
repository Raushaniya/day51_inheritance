package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare raw arraylist:
        ArrayList list1=new ArrayList();
        List list2=new ArrayList();

        //add value
        list1.add("java");
        list1.add("apple");
        list1.add(1234);
        list2.add(55.8);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println("size=" + list1.size());


    }
}
