package OfficeHours.Practice_04_14_2021;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20.0));
        double sum = add(1,3);
        System.out.println("sum = "+ sum);
        System.out.println("100.0+200.0= "+ add(100,200));

        System.out.println(minus(10,3));
        System.out.println(multiply(2,10));
        System.out.println(multiply(40,10));


    }
    public static double add(double num1,double num2){
        double result=num1+num2;
        return result;// return num1+num2

    }
    public static double minus(double num1,double num2) {
        double result = num1 - num2;
        return result;
    }

        public static double multiply(double num1, double num2){
            double result=num1*num2;
            return result;

        }
        public static double divide(double num1, double num2){
            double result=num1/num2;
            return result;
        }
    }

