package day40b_ReviewClass;

public class GroupJob {
    public static void main(String[] args) {


            String str1 = "java";
            String str2 = "another";
            //             0123456
            System.out.println(combineTwoStrings(str1, str2));
        }

        public static String combineTwoStrings(String str1, String str2) {
            String result = "";
            String longer = "";
            String shorter = "";
            if (str1.length() > str2.length()) {
                longer = str1;
                shorter = str2;
            } else {
                longer = str2;
                shorter = str1;
            }
            for (int i = 0; i < shorter.length(); i++) {
                result += str1.charAt(i) + "" + str2.charAt(i);
            }
            result += longer.substring(shorter.length());

            return result;
        }
    }



