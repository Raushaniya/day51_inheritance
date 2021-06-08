package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Raushaniya Vega";
        employee1.jobTitle = "SDET";
        employee1.work();
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);

        Employee employee2 = new Employee();
        employee2.name = "Nursultan Amanov";
        employee2.jobTitle = "Tower technician";
        employee2.work();
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);

        employee1.work();

    }
}
