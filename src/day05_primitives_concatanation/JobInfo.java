package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        //title,company,jobDescription,salary,yearExp,hasBenefits

        String title = "SDET";
        String company = "Google";
        String jobDescription = "Experience in Java, Selenium, Cucumber, JUnit";
        double salary = 100000;
        byte yearExp = 2;
        boolean hasBenefits = true;

        System.out.println("Title: "   + title); //also you can ("Title: " + title)
        System.out.println("Company: " + company); // also ("Company: " + company)
        System.out.println("Job description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of experience: " + yearExp);
        System.out.println("Has Benefits? - " + hasBenefits);







    }
}
