import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;

        System.out.print("성적 입력 : ");
        score = keyboard.nextInt();

        if (score >= 90) {
            System.out.println("A학점 취득 성공");
        } else {
            System.out.println("A학점 취득 실패");
        }

        System.out.println("감사합니다");
    }
}
