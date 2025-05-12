package homeWork;

class Student1 {
    protected String name;
    protected int[] scores;

    public Student1(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }
    public int sumScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
    public void printInfo() {
        int sum = sumScore();
        String grade;

        if (sum >= 100) {
            grade = "A";
        } else if (sum >= 90) {
            grade = "B";
        } else if (sum >= 80) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("이름: " + name);
        System.out.println("총점: " + sum);
        System.out.println("등급: " + grade);
    }
}

class GraduateStudent extends Student1 {
    private String subject;

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

public class session_3 {
    public static void main(String[] args) {
        String name = "장서빈";
        int[] scores = {100, 81, 77};
        String subject = "컴퓨터소프트웨어학과";

        GraduateStudent student = new GraduateStudent(name, scores, subject);
        student.printInfo();
    }
}

