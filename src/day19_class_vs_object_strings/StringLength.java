package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());

        String password = "abc123";
        /** if statement:
         * When password is at least 6 characters:
         * print: valid amazon password
         * else
         * print: password too short
         */
        if(password.length() >=6) {
            System.out.println("Valid Amazon password"); //twill run
        }else{
            System.out.println("Password must be at least 6 characters");
        }
    }

}
