public class ScoreArrayExample {
    public static void main(String[] args) {
        // 1. 배열 선언 및 초기화
        int[] score = {95, 70, 80, 75, 100};

        // 2. 배열에 저장된 값 출력
        System.out.println("JAVA 점수 출력:");
        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번째 학생의 점수: " + score[i]);
        }
    }
}
