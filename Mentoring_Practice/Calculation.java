package Mentoring_Practice;
import java.util.Scanner;

class Add {
    protected int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

class Sub {
    protected int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}

class Mul {
    protected int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a * b;
    }
}

class Div {
    protected int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하세요 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        int result = 0;

        switch (op) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                result = add.calculate();
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                result = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                result = mul.calculate();
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                result = div.calculate();
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println(result);
    }
}