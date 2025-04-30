package homeWork;

import java.util.Scanner;

class Student {
    public String name;
    public int age;
    public double score;
    public double getScore() {
        return score;
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성적: " + score);
    }
}
/// //////////////////////////////////////////////////////////////////////////////////////////////////////
class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(String name, int age, double score) {
            students[count] = new Student(name, age, score);
            count++;
    }

    public void printAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i].printInfo();
            System.out.println("-------------------");
        }
    }

    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].getScore();
        }

        double average = sum / count;
        System.out.printf("평균 성적: %.1f\n", average); //코드 다시 보기!!
    }

    public void printTopStudent() {
        Student top = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].getScore() > top.getScore()) {
                top = students[i];
            }
        }
        System.out.println("최고 성적 학생:");
        top.printInfo();
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);
        while (true) {
            printMenu();

            System.out.print("메뉴를 선택하세요: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    //학생 추가하기
                    sc.nextLine(); //이름 안 지나가게 한 번 정리
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("나이: ");
                    int age = sc.nextInt();
                    System.out.print("성적: ");
                    double score = sc.nextDouble();
                    manager.addStudent(name, age, score);
                    break;

                case 2:
                    //전체 학생 보기
                    manager.printAllStudents();
                    break;
                case 3:
                    //평균 성젇 보기
                    manager.printAverageScore();
                    break;
                case 4:
                    //최고성적 보기
                    manager.printTopStudent();
                    break;
                case 0:
                    //종료하기
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    //잘못된 번호 눌렀을 때
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
            System.out.println();
        }
    }

    //메뉴 출력하기
    public static void printMenu() {
        System.out.println("========== 학생 관리 프로그램 ==========");
        System.out.println("1. 학생 정보 추가(이름, 나이, 성적)");
        System.out.println("2. 전체 학생 정보 출력");
        System.out.println("3. 평균 성적 출력");
        System.out.println("4. 최고 성적 학생 정보 출력");
        System.out.println("0. 종료");
        System.out.println("=====================================");
    }
}
