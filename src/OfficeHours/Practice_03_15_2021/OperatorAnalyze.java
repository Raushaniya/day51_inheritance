package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyze {
    int a = 5;
    int b = a++ + a-- + a *2 + a + ++a;
    //      5  +  6   + 5 *2 + 5 +6
    // 5+6+10+5+6
    //11+10+5+6
    //21+5+6
    // 26+6 = 32
}
