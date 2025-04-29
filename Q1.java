class Student {
    String name;
    int age;
    int studentID;
    public Student() {
        this.name = "홍길동";
        this.age = 20;
        this.studentID = 25123456;
    }

    public Student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public void introduce() {
        System.out.println("학생 이름: " + this.name);
        System.out.println("학생 나이: " + this.age);
        System.out.println("학생 학번: " + this.studentID);    //this 생략 가능!
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20, 25123456);
        student1.introduce();
        Student student2 = new Student("이대복", 24, 21101840);
        student2.introduce();
    }
}
