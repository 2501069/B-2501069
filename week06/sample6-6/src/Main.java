import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int HEART = 65; // 심박수 (분당 65회)
        int life;             // 산 나이 (입력값)
        long result;          // 총 심박수 (1년 * 분당 박동수)

        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신은 몇 년 사셨나요? : ");
        life = keyboard.nextInt();

        // 총 심박수 계산
        result = (long) life * 365 * 24 * 60 * HEART;

        // 출력
        System.out.printf("우리의 심장은 분당 %d회 박동합니다.%n", HEART);
        System.out.printf("%d년 동안 우리의 심장은 약 %,d회 박동합니다.%n", life, result);

        keyboard.close();
    }
}
