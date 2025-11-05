import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;
        int sum = 0;

        // 1회부터 10회까지 반복
        for (int count = 1; count <= 10; count++) {
            System.out.printf("%d회차 - 양의 정수 입력: ", count);
            num = keyboard.nextInt();

            if (num < 0) {
                System.err.println("ERROR: 양의 정수를 입력하세요.");
                // 음수가 입력되면 그 회차는 건너뛰고 다시 입력받지 않음
                continue;
            }

            sum += num; // 올바른 값이면 합계에 더함
        }

        System.out.printf("1회부터 10회까지 입력한 수의 합계는 %d입니다.%n", sum);

        keyboard.close();
    }
}
