import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner KEYBOARD = new Scanner(System.in);

        final int MPS = 340; // 음속: 초속 340m
        final int YEAR_SECONDS = 365 * 24 * 60 * 60; // 1년 = 초 단위

        System.out.print("전투기의 속도를 마하 단위로 입력하세요: ");
        float fighter = KEYBOARD.nextFloat(); // 예: 2.5 (마하)

        // 마하 → m/s 단위로 변환
        float speed = fighter * MPS;

        // 1년 동안 이동한 거리 (m 단위)
        double distanceMeters = speed * YEAR_SECONDS;

        // m → km 변환
        double distanceKm = distanceMeters / 1000.0;

        // 출력
        System.out.printf("마하 %.1f인 전투기의 1년간 거리는 %, .0f km 입니다.%n", fighter, distanceKm);

        KEYBOARD.close();
    }
}
