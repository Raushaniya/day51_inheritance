package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";                 //1 way
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-432-1234"}; //2d way of array

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname= " + student1[1]);
        System.out.println("student1 lastname= " + student1[2]);
        System.out.println("student1 batch num= " + student1[3]);
        System.out.println("student1 mobile num= " + student1[4]);

        System.out.println("student data length: " + student1.length);

        //check if student1 data array contains 5 items.
        // true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }


        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */
        if (student1 == student2) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }
        /**
         * read from array and print  firstname and lastname in all uppercase
         * ADAM SMITH
         */
                         //output:Adam->ADAM                Smith->SMITH
        System.out.println(student1[1].toUpperCase()+" "+student1[2].toUpperCase());

    }
}

