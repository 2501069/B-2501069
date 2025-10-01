public class Main {
    public static void main(String[] args) {

        int a = 5 > 3 ? 6 : 7;  // true → a = 6
        System.out.printf("a = %d%n", a);

        int b = 2 > 3 ? a++ : a--;  // false → a-- 실행 → b = 6, a = 5
        System.out.printf("a = %d, b = %d%n", a, b);

        int c = b > a ? ++b - 1 : a++ + 1;  // b=6, a=5 → true → b=7, c=6
        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);

        // 삼항 연산자 새로 작성:
        c = (b > a) && (a++ > 3) ? ++b - 1 : a++ + 1;
        System.out.printf("a = %d, b = %d, d = %d%n", a, b, c);
    }
}
