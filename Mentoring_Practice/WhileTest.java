package Mentoring_Practice;

//1.0부터 2씩 증가하는 짝수를 더하는 반복문, 결과는 2450
//2.
public class WhileTest {
    public static void main(String[] args) {
        int sum=0, i=0;
        while(i<100){
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
    }
}

//3.
class ForTest{
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<100; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

//4.
class DoWhileTest{
    public static void main(String[] args) {
        int sum=0, i=0;
        do{
            sum += i;
            i += 2;
        } while(i<100);
        System.out.println(sum);
    }
}