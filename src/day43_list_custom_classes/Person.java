package day43_list_custom_classes;

public class Person {

    //data
    String firstName;
    int age;
    char gender;

    //behaviour -> method
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class People{ //class for running with main method
    public static void main(String[] args) {
        //create object of Person class - Inst
        Person person1 = new Person();
        person1.firstName= "Bob";
        person1.age = 33;
        person1.gender= 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName= "Sarah";
        person2.age = 33;
        person2.gender= 'F';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);
    }


}


