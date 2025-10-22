import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;

        System.out.print("분자 입력 : ");
        num1 = keyboard.nextInt();

        System.out.print("분모 입력 : ");
        num2 = keyboard.nextInt();

        String output = (num2 == 0)
                ? "error : 분모가 0으로 나누셈을 할 수 없음"
                : String.format("%d / %d = %f", num1, num2, (float)num1 / num2);

        System.out.println(output);
    }
}
