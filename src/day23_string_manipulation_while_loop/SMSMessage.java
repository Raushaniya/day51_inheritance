package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From Number<+12223334444> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        
        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);
        //                                    26              27                  41
        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">")); //whatever between 27 & 41 =mobile number
        System.out.println("mobile = " + mobile);
        
        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);
        System.out.println("Fikret".trim());
        sender = sender.trim();

        if(sender.equals("Nadir")) {
            System.out.println("Message from Nadir about homework");
        }else{
            System.out.println("Someone else message");
        }

    }
}
