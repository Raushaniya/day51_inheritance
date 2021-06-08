package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";   //String always object type,
        String model = "iPhone11"; //object
        String color = "green"; //cause it has letters
        double price = 699.99; // it has double numbers
        int storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);


        //WITH MESSAGE
        System.out.println("Brand is "  +  brand); //it runs Brand is Apple
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Price is $" + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - " + hasCamera);



















    }
}
