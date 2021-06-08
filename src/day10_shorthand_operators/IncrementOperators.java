package day10_shorthand_operators;

public class IncrementOperators {
    public static void main(String[] args) {
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase lineesOf Code by 1, 3 ways that we learnt today
         linesOfCode = linesOfCode + 1; //-> traditional way
         linesOfCode +=1; //-> shorthand way
         linesOfCode++; //shortest way 
         ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        //type 4 different ways of decreasing by 1

        linesOfCode = linesOfCode -1;
        linesOfCode -=1;
        linesOfCode --;
        -- linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter); //a
        letter ++;
        System.out.println("letter = " + letter); //b
        ++ letter;
        System.out.println("letter = " + letter); //c
        ++letter;
        System.out.println("letter = " + letter); //d

        letter --;
        System.out.println("letter = " + letter); //c -> cause one step back

        letter--; letter --; letter --;
        System.out.println("letter = " + letter);



    }
}
