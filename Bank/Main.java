package Bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("21101840 이대복");

        CheckingAccount account = new CheckingAccount("123-4567890", 100000.0);
        account.displayAccountInfo();

        account.withdraw(100000.0);
        account.deposit(50000.0);
        account.addInterest();
        account.displayAccountInfo();
    }
}
