package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args){
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance - (price1 + price2 + price3);

        System.out.println("Balance: \t\t\t\t$ " + balance); // balance;345.55
        System.out.println("Remaining Balance:\t \t$ " + remainingBalance); // 345.55-(20.88 + 89.99+15)

        int balanceWithNoCents  = (int)remainingBalance; // (short)remainingBalance also works
        System.out.println("Balance with no cents: \t$ " + balanceWithNoCents);



    }
}
