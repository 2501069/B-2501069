import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반지름 입력
        System.out.print("구의 반지름을 입력하세요: ");
        int r = sc.nextInt();

        // 상수 π
        double pi = 3.141592;

        // 부피와 표면적 계산
        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);
        double surfaceArea = 4 * pi * Math.pow(r, 2);

        // 결과 출력
        System.out.printf("구의 부피: %.6f\n", volume);
        System.out.printf("구의 표면적: %.6f\n", surfaceArea);

        sc.close();
    }
}
