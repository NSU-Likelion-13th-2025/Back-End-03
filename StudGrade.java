public class StudGrade {
    public static void main(String[] args) {
        System.out.println("학생 성적 결과");

        int[] scores = {85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        int sum = 0;
        int count = 0;    // score로 사용한 부분 모두 대체 가능!
        int max = 0;
        int min = 100;

        for(int i = 0; i < scores.length; i++) {
            int score = scores[i];

            if(score < 0 || score > 100) {
                System.out.println("오류 발생");
                continue;
            }

            String grade;
            if(score >= 90) grade = "A";
            else if (score >= 80) grade = "B";
            else if (score >= 70) grade = "C";
            else if (score >= 60) grade = "D";
            else grade = "F";

            String result = (score >= 60) ? "합격" : "불합격";

            System.out.println("학생 " + (i + 1) + ": 성적 = " + score + ", 평가 = " + grade + " " + result);

            sum += score;
            //count++;

            if(score > max) {
                max = score;
            }

            if(score < min) {
                min = score;
            }

            if(score == 100) {
                System.out.println("최고 점수 100점 발견! 더 이상 최고 점수를 찾지 않습니다.");
                break;
            }
        }
        if(count > 0) {
            double avg = (double) sum/count;    // (double)sum/scores.length
            System.out.println("평균 점수 : " + avg);
            System.out.println("최고 점수 : " + max);
            System.out.println("최저 점수 : " + min);
        } else {
            System.out.println("유효점수 없음");
        }
    }
}

