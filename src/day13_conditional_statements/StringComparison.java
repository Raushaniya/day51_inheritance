package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Paris";
        if(city.equals("New York")){ // other way - if(city=="New York"{
            System.out.println(" It is NY");
        }else{
            System.out.println(" It is not NY");
        }

        String weather = "cold";
        if(weather.equals("sunny")){
            System.out.println("Lets go out!");
        }else{
            System.out.println("Lets stay home!");
        }
    }

}
