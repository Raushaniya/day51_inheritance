package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "lazy"; // String weather = "sunny"
        if(weather.equals("sunny" )) {
            System.out.println(weather + " - Go to the park, hiking,riding bykes and enjoy ");
        }else if(weather.equals("rainy")) {
            System.out.println(weather+ " - Stay home, drink tea and code java");
        }else if(weather.equals("snowy")) {
            System.out.println(weather + " - Clean you car, build snowman, drink hot chocolate and code java");
        }else if(weather.equals("windy")) {
            System.out.println(weather + " - Get ready for power loss, fli a kite, and code java ");
        }else{
            System.out.println(" Code java!");
        }
    }
}
