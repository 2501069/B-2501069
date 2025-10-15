public class Main {
    public static void main(String[] args) {

        final double PI = 3.141592;     // 원주율
        final double RADIUS = 6_378_137; // 지구 반지름 (m)
        final double KOREA = 99_720;     // 대한민국 면적 (km²)

        // 지구 표면적 = 4πr² (m² 단위)
        double surface = 4 * PI * RADIUS * RADIUS;

        surface /= 1_000;

        // 대한민국 면적 비율 계산
        double percent = (KOREA / surface) * 100;

        // 출력
        System.out.printf("지구의 반지름은 %, .0f m 입니다.%n", RADIUS);
        System.out.printf("지구의 표면적은 약 %, .0f km² 입니다.%n", surface);
        System.out.printf("대한민국의 면적은 %, .0f km² 입니다.%n", KOREA);
        System.out.printf("대한민국의 면적은 지구 표면적의 약 %.8f%% 입니다.%n", percent);
    }
}
