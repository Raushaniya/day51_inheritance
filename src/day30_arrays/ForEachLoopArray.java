package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        // indexex=   0    1    2   3    4   5    6    7    8   9
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
            System.out.println("----------FOR EACH LOOP----------");
        for( int eachNum : data ) {
            System.out.println(eachNum);
        }
             for(int n : data){
                 System.out.println(n + " ");
             }

            System.out.println("------------FOR LOOP-----------");
             //repeat above with for loop
        for(int i=0; i<data.length;i++){
            System.out.println(data[i]);
        }
            //print last value in array using length -1
                                //10     -1
            System.out.println("last value: " + data[data.length-1]);

        //print all numbers backwards in same line
        for(int i = data.length-1; i>=0;i--){     // it can be other variable name (idx,j,nums,etc)
            System.out.print(data[i] + " ");
        }
    }
}
