package OfficeHours.Practice_03_16_2021;
import java.util.Scanner;
public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* You are in a baking contest. Your cookies will be rated by 3 judges.
       The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

       Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

        If your score is more than both of the other people then print "First place!"
        If your score is more then one other person then print "Second place"
        If your score is less than both of the other people then print "Third place
          */
        int judge = 1;
        System.out.println("Enter judge: " + judge++ + "score");
        int scoreOne = scan.nextInt();
        System.out.println("Enter judge: " + judge++ + "score");
        int scoreTwo = scan.nextInt();
        System.out.println("Enter judge: " + judge++ + "score");
        int scoreThree = scan.nextInt();
        System.out.println("Enter other person 1's score ");
        int otherPerson1 = scan.nextInt();
        System.out.println("Enter other person 2's score ");
        int otherPerson2 = scan.nextInt();
        int ourAverageScore = (scoreOne + scoreTwo + scoreThree) / 3;

        if(ourAverageScore < otherPerson1 && ourAverageScore > otherPerson2) {
            System.out.println("First place");
        } else if( (ourAverageScore > otherPerson1 && ourAverageScore < otherPerson2)
                || (ourAverageScore<otherPerson1 && ourAverageScore>otherPerson2)) {
            System.out.println("Second place");
        }else{
            System.out.println("Third place");
        }
    }
}
