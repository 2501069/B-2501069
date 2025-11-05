public class Main {
    public static void main(String[] args) {
        int lower = 0;    // 화씨 최저 온도
        int upper = 100;  // 화씨 최고 온도
        int step = 10;    // 온도 간격

        float celsius;
        int fahr = lower;

        System.out.printf("%4s %6s\n", "화씨", "섭씨");
        System.out.println("---------------------");

        do {
            // 섭씨 온도 계산
            celsius = (fahr - 32.0f) * 5.0f / 9.0f;

            // 출력
            System.out.printf("%4d %6.1f\n", fahr, celsius);

            // 다음 온도로 이동
            fahr += step;
        } while (fahr <= upper);
    }
}
