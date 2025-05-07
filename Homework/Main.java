package Homework;

public class Main {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("이대복", new int[]{100, 100, 100}, "컴퓨터소프트웨어");
        graduateStudent.printInfo();
    }
}

class Student{
    public String name;
    public int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public int sumScore() {
        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public void printInfo() {
        int sum = sumScore();
        System.out.println("학생 이름: " + name);
        System.out.println("합계 점수: " + sum);

        String grade;
        if (sum >= 270) {
            grade = "A";
        } else if (sum >= 240) {
            grade = "B";
        } else if (sum >= 210) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("등급: " + grade);
    }
}

class GraduateStudent extends Student{
    String subject;

    public GraduateStudent(String name, int[] scores, String subject) {
        super(name, scores);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("학과: " + subject);
    }
}