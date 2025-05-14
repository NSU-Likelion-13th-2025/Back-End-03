package Bank;

public class CheckingAccount extends BankAccount implements BankInterest {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // 추상 클래스 BankAccount의 생성자 호출
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println();
            System.out.println(amount + "원이 입금됐습니다.");
            System.out.println("잔액: " + balance + "원");
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println();
            System.out.println(amount + "원이 출금됐습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("출금 실패: 잔액이 부족하거나 금액이 잘못되었습니다.");
        }
    }

    @Override
    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println();
        System.out.println("이자 " + interest + "원이 추가됐습니다.");
        System.out.println();
    }

    public void displayAccountInfo() {
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("이자율: " + (INTEREST_RATE * 100) + "%");
    }
}
