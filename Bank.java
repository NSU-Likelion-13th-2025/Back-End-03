package homeWork;

abstract class BankAccount{
    void deposit(double amount){}
    void withdraw(double amount){}
}

interface BankInterest{
    void addInterest();
}

class CheckingAccount extends BankAccount implements BankInterest{
    String accountNumber;
    double balance;
    public CheckingAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void withdraw(double amount){ //출금
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println(amount + "원이 출금됐습니다.");
            System.out.println("현재 잔액: " + balance + "원\n");
        }else {
            System.out.println("출금 금액이 올바르지 않거나 잔액이 부족합니다");
        }
    }
    void deposit(double amount){ //입금
        if(amount > 0){
            balance += amount;
            System.out.println(amount + "원이 입금됐습니다.");
            System.out.println("잔액: " + balance + "원\n");
        }else {
            System.out.println("입금 금액이 올바르지 않습니다.");
        }
    }
    public void addInterest(){ //이자 계싼 및 추가
        double interest = balance * 0.02;
        balance += interest;
        System.out.println("이자 " + interest + "원이 추가됐습니다.\n");
    }
    public void displayAccountInfo() {//계좌 정보 출력
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("이자율: " + 0.02*100 + "%\n");
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("23101335 장서빈");

        CheckingAccount checkingAccount = new CheckingAccount("123-4567890", 100000.0);
        checkingAccount.displayAccountInfo();

        checkingAccount.withdraw(100000.0);
        checkingAccount.deposit(50000.0);
        checkingAccount.addInterest();

        checkingAccount.displayAccountInfo();
    }
}
