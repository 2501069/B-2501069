import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        float s, area;
        String result;

        System.out.println("삼각형의 세변의 길이(정수) 입력 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 삼각형 판별 조건
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            s = (a + b + c) / 2.0f;  // 반둘레
            area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c)); // 헤론 공식
            result = String.format("삼각형 가능! 면적 : %.2f ㎠", area);
        } else {
            result = "삼각형을 만들 수 없습니다.";
        }

        System.out.printf("삼각형의 각 변의 길이 %d cm, %d cm, %d cm → %s\n", a, b, c, result);
    }
}
