package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
       displayMessage();//1st call the method
       displayMessage(); //2nd call to methed
       displayMessage();//3rd call the method
     //   for(int i =1; i<=100;i++){
      //      System.out.print(i + "-");  we can use with loop
      //      displayMessage();
        }

    //first custom re-usable method
    public static void displayMessage(){
        System.out.println("Hello B22 Friends!");
    }

}
