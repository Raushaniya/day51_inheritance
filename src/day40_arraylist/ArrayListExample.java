package day40_arraylist;
import java.util.*; //import java.util.ArrayList;import java.util.list;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java"); ERROR
        System.out.println("size = " + nums.size());

        //reading from arraylist
        System.out.println("index 0= "+nums.get(0)); //index 0=5
        System.out.println("index 1= "+nums.get(1));//index 1=7
        System.out.println("index 2= "+nums.get(2)); //index2=11
     //   System.out.println("index 3= "+nums.get(3)); //Indexoutofbounds

        //print all values in same line:
        System.out.println(nums); //arrays.toString(numArray);

        //remove element at index 1 ->(number 7)
        nums.remove(1);
        System.out.println(nums);

    }

}
