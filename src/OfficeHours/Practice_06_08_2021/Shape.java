package OfficeHours.Practice_06_08_2021;

public class Shape {
    double area;
    double perimeter;

    public void calculateArea(){
        System.out.println("Shape area");
    }

    public void calculatePerimeter(){
        System.out.println("Shape Perimeter");
    }

    @Override
    public String toString() {
        return "Square{" +
                "area = " + area +
                ", perimeter =" + perimeter +
                "}";
    }
}
