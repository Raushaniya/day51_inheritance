package day46_encapsulation;

public class CapitolOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setAccountNumber(123456789987L);
        account.setAccountHolder("Mike Smith");
        account.setBalance(2500.00);
        account.setType("checking");

        System.out.println("account = " + account);

    }
}
