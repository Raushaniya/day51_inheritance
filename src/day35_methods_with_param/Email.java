package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
       buildEmail("rau","gmail");
       buildEmail("John Ward III","verizon");
    }
    public static void buildEmail(String name,String domain){
        name = name.replace(" ","_").toLowerCase();//john_ward_iii@verizon.com
        String email = name+"@"+domain+".com";
        System.out.println(email);



    }
}
