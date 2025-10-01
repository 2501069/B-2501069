public class Main {
    public static void main(String[] args) {
        boolean test = (0 == -0);
        boolean test1 = 1 < 4;
        boolean test2 = 'a' > 'A';
        boolean test3 = ('a' == 2) && ('b' != 2);
        boolean test4 = true != false;
        boolean test5 = true == false;
        boolean test6 = (10 % 3 == 1);     // 추가된 테스트 6 (true)

        System.out.printf("test = %b%n", test);
        System.out.printf("test1 = %b%n", test1);
        System.out.printf("test2 = %b%n", test2);
        System.out.printf("test3 = %b%n", test3);
        System.out.printf("test4 = %b%n", test4);
        System.out.printf("test5 = %b%n", test5);
        System.out.printf("test6 = %b%n", test6);   // 출력도 추가
    }
}
