package homeWork;

import java.util.Scanner;

class Student {
    String name;
    int age;
    String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    public Student() {
        Scanner namescan = new Scanner(System.in);
        System.out.print("학생 이름: ");
        this.name = namescan.nextLine();

        Scanner agescan = new Scanner(System.in);
        System.out.println("학생 나이:");
        this.age = agescan.nextInt();

        Scanner studentIdscan = new Scanner(System.in);
        System.out.println("학생 학번: " + studentId);
        this.studentId = studentIdscan.nextLine();
    }
    public void introduce(){
        System.out.println("학생 이름: " + name);
        System.out.println("학생 나이: " + age);
        System.out.println("학생 학번: " + studentId);
    }

}
public class week01_2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.introduce();

        Student student2 = new Student("장서빈", 22, "23101335");
        student2.introduce();
    }
}
