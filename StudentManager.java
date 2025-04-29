public class StudentManager {
    private Student_[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student_[size];
        count = 0;
    }

    public void addStudent(String name, int age, int score) {
        if (count < students.length) {
            students[count] = new Student_(name, age, score);
            count++;
            System.out.println("학생이 추가되었습니다.");
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
    }

    public void printAllStudents() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].printInfo();
        }
    }

    public void printAverageScore() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].getScore();
        }
        double avg = (double) sum / count;  // 정수 나눗셈 방지
        System.out.println("평균 성적: " + avg);
    }

    public void printTopStudent() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        Student_ top = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].getScore() > top.getScore()) {
                top = students[i];
            }
        }
        System.out.println("최고 성적 학생 정보:");
        top.printInfo();
    }
}
