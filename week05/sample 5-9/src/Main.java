import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float height;
        char gender;
        float weight;

        System.out.print("당신의 키(meter)입력 : ");
        height = scanner.nextFloat();

        System.out.print("당신의 성별 (남 = 'M', 여 = 'F') 입력 : ");
        gender = scanner.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            weight = height * height * 22;
        } else if (gender == 'F' || gender == 'f') {
            weight = height * height * 20;
        } else {
            weight = 0.0f;  // 성별 잘못 입력 시 기본값
            System.out.println("성별 입력이 올바르지 않습니다.");
        }

        if (weight > 0) {
            System.out.printf("키가 %.1f m인 %c자의 표준 체중은 %.2f kg 입니다.%n", height, gender, weight);
        }

        scanner.close();
    }
}
