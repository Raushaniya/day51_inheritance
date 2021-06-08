package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(",")); //4
        //last comma
        System.out.println(technologies.lastIndexOf(",")); //41
        //for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava); //0 it gives beginning of word java

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index = " + idxOfCss); //12  where css statrs,position 12

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index = " + idxOfCucumber); // cucumber starts at position 43
        int idxSql = technologies.indexOf("sql"); // -1 (not present this word sql)
        System.out.println("sql is at index = " + idxSql);

        //technologies contains "maven"?
        if(technologies.contains("maven")) {
            System.out.println("maven is present"); //runp
        }else{
            System.out.println("maven is not present");
        }







    }
}
