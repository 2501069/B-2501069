public class Main {
    public static void main(String[] args) {

        final int year = 365;         // 1년
        final int speed = 300_000;    // 빛이 1초에 가는 거리 (km)

        long seconds;   // 1년 동안의 초 (int로는 부족)
        long distance;  // 1년 동안 빛이 간 거리

        // 1년 = 365일 → 초 단위로 변환
        seconds = (long) year * 24 * 60 * 60;

        // 빛이 1년 동안 이동한 거리 계산
        distance = seconds * speed;

        // 결과 출력 (printf 사용)
        System.out.printf("빛은 1초에 %,d km를 이동합니다.%n", speed);
        System.out.printf("%d일은 %,d초 입니다.%n", year, seconds);
        System.out.printf("빛이 1년 동안 이동한 거리는 %,d km입니다.%n", distance);
    }
}
