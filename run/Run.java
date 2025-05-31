package run;

import Vo.*;

import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student p[] = new Student[3];
        p[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        p[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        p[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        Employee e[] = new Employee[10];
        int count = 0;
        boolean more = true;

        while(count < 10 && more){
            System.out.println("이름, 나이, 키, 몸무게, 급여, 부서를 입력하세요");

            String name = sc.nextLine();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            double weight = sc.nextDouble();
            int salary = sc.nextInt();
            sc.nextLine();
            String dept = sc.nextLine();

            e[count] = new Employee(name, age, height, weight, salary, dept);
            count++;

            while(true){
                System.out.println("계속 추가할거? y/n");
                String s = sc.nextLine();

                if(s.equals("y")) {
                    break;
                }else if(s.equals("n")) {
                    more = false;
                    break;
                } else {
                    System.out.println("다시 입력");
                }
            }
        }
        System.out.println("직원 목록");
        for(int i=0; i<count; i++){
            System.out.print(e[i]);
            System.out.println();
        }
    }
}


