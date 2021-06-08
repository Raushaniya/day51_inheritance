package day35_methods_with_param;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count);
        greetByName("Nurik");
        greetByName("Rau");
        String name ="Danny";
        greetByName(name);
    }

      public static void displayValue(int num){
          System.out.println("value is " + num);
    }
    /**
     * method name: greetByName
     * @param/input: String name
     * It prints "Hello{name},how are you today?
     */
    public static void greetByName(String name){
        System.out.println("Hello " + name + ",how are you today?");
    }





}
