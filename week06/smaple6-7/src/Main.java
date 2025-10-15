import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int GOLD = 849_000; // 금 1돈(3.75g) 가격 (원)
        float weight;  // 체중 (kg)
        float don;     // 몸무게를 돈 단위로 환산
        long result;   // 몸값 (원)

        System.out.print("당신의 체중은? (kg): ");
        weight = keyboard.nextFloat();

        // 체중(kg) → g → 돈 단위로 환산
        don = weight * 1000 / 3.75f;

        // 몸값 계산
        result = (long) (don * GOLD);

        // 출력 (printf로 수정)
        System.out.printf("금 1돈(3.75g)의 가격은 %,d원 입니다.%n", GOLD);
        System.out.printf("나의 체중은 %.1fkg (약 %.1f돈) 입니다.%n", weight, don);
        System.out.printf("나의 몸값은 약 %,d원 입니다.%n", result);

        keyboard.close();
    }
}
