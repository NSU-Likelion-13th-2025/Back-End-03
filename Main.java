import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(10);

        while (true) {
            System.out.println("\n==== 학생 관리 프로그램 ====");
            System.out.println("1. 학생 정보 추가");
            System.out.println("2. 전체 학생 정보 출력");
            System.out.println("3. 평균 성적 출력");
            System.out.println("4. 최고 성적 학생 출력");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("이름 입력: ");
                    String name = sc.next();
                    System.out.print("나이 입력: ");
                    int age = sc.nextInt();
                    System.out.print("성적 입력 (정수): ");
                    int score = sc.nextInt();  // float → int로 변경
                    manager.addStudent(name, age, score);
                    break;
                case 2:
                    manager.printAllStudents();
                    break;
                case 3:
                    manager.printAverageScore();
                    break;
                case 4:
                    manager.printTopStudent();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }
}
