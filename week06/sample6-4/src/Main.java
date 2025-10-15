import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner KEYBOARD = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요 (℃): ");
        float degree = KEYBOARD.nextFloat();  // 사용자 입력 받기

        // 화씨로 변환
        float result = degree * 9 / 5 + 32;

        // 결과 출력
        System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉ 입니다.%n", degree, result);

        KEYBOARD.close();
    }
}
