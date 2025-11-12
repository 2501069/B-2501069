import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 배열 선언
        String[] names = new String[10];
        double[] weights = new double[10];

        // 2. 학생 이름과 몸무게 입력받기
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 학생의 이름을 입력하세요: ");
            names[i] = sc.next();

            System.out.print(names[i] + "의 몸무게(kg)를 입력하세요 (30.0~120.0): ");
            weights[i] = sc.nextDouble();

            // 유효성 검사
            while (weights[i] < 30.0 || weights[i] > 120.0) {
                System.out.print("⚠️ 잘못된 값입니다. 다시 입력하세요 (30.0~120.0): ");
                weights[i] = sc.nextDouble();
            }
        }

        // 3. 초기값 설정 (첫 번째 학생을 기준으로)
        double maxWeight = weights[0];
        double minWeight = weights[0];
        String maxName = names[0];
        String minName = names[0];

        // 4. 최대/최소 몸무게 찾기
        for (int i = 1; i < 10; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxName = names[i];
            }
            if (weights[i] < minWeight) {
                minWeight = weights[i];
                minName = names[i];
            }
        }

        // 5. 결과 출력
        System.out.println("\n===== 결과 =====");
        System.out.printf("가장 무거운 학생: %s (%.1f kg)\n", maxName, maxWeight);
        System.out.printf("가장 가벼운 학생: %s (%.1f kg)\n", minName, minWeight);

        sc.close();
    }
}
