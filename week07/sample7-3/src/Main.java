import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("정수 입력 : ");
        num = keyboard.nextInt();

        // 1) 삼항 연산자
        result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("[삼항연산자] %d는 %s입니다.\n", num, result);

        // 2) if문
        if (num % 2 == 0) {
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.printf("[if문] %d는 %s입니다.\n", num, result);

        // 3) switch문
        switch (num % 2) {
            case 0:
                result = "짝수";
                break;
            default: // = case 1
                result = "홀수";
                break;
        }
        System.out.printf("[switch문] %d는 %s입니다.\n", num, result);
    }
}
