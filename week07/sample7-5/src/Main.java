import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;

        System.out.print("첫 번째 정수 입력: ");
        num1 = keyboard.nextInt();

        System.out.print("두 번째 정수 입력: ");
        num2 = keyboard.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 수는 " + num1 + " 입니다.");
        } else if (num1 < num2) {
            System.out.println("더 큰 수는 " + num2 + " 입니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }

        System.out.println("프로그램 종료");
    }
}
