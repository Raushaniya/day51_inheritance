package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>(); //polimorphic way of declaration
        System.out.println(nums);
        
        nums.add(5578);nums.add(78);nums.add(31);
        nums.add(11);nums.add(55);nums.add(8);nums.add(7);
        nums.add(408);nums.add(89);nums.add(7);
        System.out.println("nums = " + nums);//will print all numbers in []

        nums.remove(0);
        System.out.println("nums = " + nums);//5578 is gone
           // nums.remove(89);-it will think that it is index 89->(IndexOutOfException)
        nums.remove(new Integer(89));
        System.out.println("nums = " + nums);//89 is gone now
        //if we have 2"7"
        nums.remove(new Integer(7));
        System.out.println("nums = " + nums); //it removed first"7",second 7 will stay
           // for loop -iterate through all values and print
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));

            //for each loop,and print all in same line
            for(Integer each : nums){ //we can also use int each

                System.out.print(each + " ");
            }
        }



    }
}
