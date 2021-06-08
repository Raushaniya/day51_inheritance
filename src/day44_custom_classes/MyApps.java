package day44_custom_classes;

/**
 * This class we creat
 */
public class MyApps {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object.just characters
       App uberApp = new App(); // creating a new object
        //opening Uber app -version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
       uberApp.open(); //call open method using the object variable

        uberApp.version = 4.0;
        uberApp.open(); //open new version


    }
}
