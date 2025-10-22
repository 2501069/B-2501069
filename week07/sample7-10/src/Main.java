import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0~100): ");
        int score = sc.nextInt();
        String grade = "";

        if (score >= 95 && score <= 100) {
            grade = "A+";
        } else if (score >= 90 && score <= 94) {
            grade = "A";
        } else if (score >= 85 && score <= 89) {
            grade = "B+";
        } else if (score >= 80 && score <= 84) {
            grade = "B";
        } else if (score >= 75 && score <= 79) {
            grade = "C+";
        } else if (score >= 70 && score <= 74) {
            grade = "C";
        } else if (score >= 65 && score <= 69) {
            grade = "D+";
        } else if (score >= 60 && score <= 64) {
            grade = "D";
        } else if (score >= 0 && score <= 59) {
            grade = "F";
        } else {
            grade = "잘못된 점수입니다.";
        }

        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);
    }
}
