package day14_multi_branch_if_statements;

import java.sql.SQLOutput;

public class YesOrNo {
    public static void main(String[] args) {
        char selection = 'Y';
        boolean answer;

        System.out.println("Are you sure you want to delete this file? ");

        if(selection =='Y') {
            System.out.println("Your file will be deleted ");
            answer = true;
        }else{
            System.out.println("file deletion cancelled ");
            answer = false;
        }
        System.out.println(" Did file get deleted?- " + answer);
    }


}
