package Mentoring_Practice;

public class Array {
    public static void main(String[] args) {
        int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};

        for (int i = 0; i < n.length; i++) {         // 행 반복
            for (int j = 0; j < n[i].length; j++) {  // 열 반복
                System.out.print(n[i][j] + "");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
