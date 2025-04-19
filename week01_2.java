package homeWork;

import java.util.Scanner;

class Student {
    //Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    public Student() {
        Scanner namescan = new Scanner(System.in);    // Scanner는 하나로 모두 사용 가능
        System.out.print("학생 이름: ");              // 근데 메서드 안에서 쓰면 해당 메서드만 사용 가능하니
        this.name = namescan.nextLine();             // 필드에 써서 모두 사용할 수 있게 하면 좋음!

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
