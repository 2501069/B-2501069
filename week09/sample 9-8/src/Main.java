import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int number = keyboard.nextInt();

        int temp = number;  // 원래 숫자 보관
        int reversed = 0;   // 뒤집은 숫자

        // 숫자를 뒤집기
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10; // 마지막 자리수를 추가
            temp /= 10;                            // 마지막 자리 제거
        }

        // 판별
        if (number == reversed) {
            System.out.println(number + "는 회문수입니다.");
        } else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }

        keyboard.close();
    }
}
