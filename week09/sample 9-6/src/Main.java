import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("양의 정수 입력: ");
        long num = keyboard.nextLong(); // 큰 숫자도 받을 수 있도록 long 사용

        if (num < 0) {
            System.err.println("ERROR: 양의 정수를 입력하세요.");
            keyboard.close();
            return;
        }

        // 숫자 형식 출력 (천 단위 콤마)
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("입력한 정수는 " + df.format(num) + " 입니다.");

        // 각 자리수 합과 자리수 계산
        long temp = num;
        int sum = 0;
        int count = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
            count++;
        }

        System.out.println("숫자의 개수는 " + count + "개 입니다.");
        System.out.println("숫자의 합은 " + sum + " 입니다.");

        keyboard.close();
    }
}
