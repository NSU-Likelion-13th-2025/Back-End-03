package Homework;

class Solution {
    public double solution(int[] arr) {
        double sum = 0;

        //배열의 인덱스를 이용해 하나씩 접근
        for (int i=0; i<arr.length; i++) {
            //각 원소의 값을 더함
            sum += arr[i];
        }

        //평균 계산 후 반환
        double answer = sum / arr.length;
        return answer;
    }
}
