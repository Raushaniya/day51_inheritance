package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters= {'j', 'a','v','a',' ','i', 's', 'f', 'u', 'n'};

        //print each letter using a loop
        for(char each : letters) {
            System.out.println(each + " ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence= " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        //                   0           1       2       3        4        5
        String[] fruits = {"bananas", "apples", "kiwi", "mango","papaya","strawberry"};
        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each + "-");
            fruitStr+= each + "-";
        }
        System.out.println("\nfruitSt = " + fruitStr);

        String[] language = {"java", "python", "c++", "sql" , "ruby", "javascript"};
        System.out.println(String.join("",language));
        System.out.println(String.join("##",language));
        String joinedLanguages = String.join(" <> " , language);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}
