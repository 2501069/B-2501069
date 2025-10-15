public class Main {
    public static void main(String[] args) {

        final float year = 365.2422f;
        float temp;
        int day, hour, minute;
        double second;

        // 1. 정수 일 구하기
        day = (int) year;

        // 2. 남은 일 → 시간으로 변환
        temp = year - day;
        hour = (int) (temp * 24);

        // 3. 남은 소수 시간 → 분으로 변환
        temp = (temp * 24) - hour;
        minute = (int) (temp * 60);

        // 4. 남은 소수 분 → 초로 변환
        temp = (temp * 60) - minute;
        second = temp * 60;

        // 5. 결과 출력
        System.out.printf("1년은 %.4f일이며,%n", year);
        System.out.printf("%d일 %d시간 %d분 %.2f초 입니다.%n", day, hour, minute, second);
    }
}
