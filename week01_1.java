package homeWork;

public class week01_1 {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        int total = 0;
        int studentCount = 0;
        int max = 0;
        int min = 100;

        System.out.println("학생 성적 결과");

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];

            total += score;
            studentCount++;

            if (score > max) {
                max = score;
                if (score == 100) {
                    System.out.println("최고 점수 100점 발견! 더 이상 최고 점수를 찾지 않습니다.");
                    break;
                }
            }
            if (score < min) {
                min = score;
            }

            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            String pass = (score >= 60) ? "합격" : "불합격";
            System.out.println("학생 " + (i + 1) + ": 성적 = " + score + ", 평가 = " + grade + ", " + pass);
        }

        double average = (double) total / studentCount;

        System.out.printf("전체 성적 평균: %.2f\n", average);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
    }
}
