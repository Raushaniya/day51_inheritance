package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("Job Title looks good");
        }

        System.out.println(jobTitle.equals(""));

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length()); // 1 - space is a character

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); // false
        //if veggie is NOT EPMTY, print we have carrots
        if (!veggie.isEmpty()){
            System.out.println("we have" + veggie);
        }


    }
}
