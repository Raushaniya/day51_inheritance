package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1); //100
        System.out.println(num2); //100

        num1=200;
        System.out.println(num1); //200
        System.out.println(num2); //100

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;  //when we print and runs it will be n1,n2,n3=55

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthirasZipCode = 22182;
        int parvinsZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        inthirasZipCode = 20007;
        System.out.println(inthirasZipCode); //20007
        System.out.println(parvinsZipCode); //22182 (Parvin is still there)

        inthirasZipCode = 20007;
        parvinsZipCode = 33131;
        System.out.println(inthirasZipCode); //runs to 2007
        System.out.println(parvinsZipCode); //runs to 33131












    }
}
