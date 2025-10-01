public class Main {
    public static void main(String[] args) {
        boolean test = ((('a' + 1) > 'A') && ('A' > 'B'));
        boolean test1 = ((('a' + 1) > 'A') && ('A' > 'B'));

        int a = 5;  // 변수 선언

        boolean test2 = (5 > 3) && (a++ != 0);  // 조건식 수정
        boolean test3 = (2 > 3) && (++a != 0);  // 조건식 수정


        // 출력 부분 수정
        System.out.printf("test = %b%n", test);
        System.out.printf("test1 = %b%n", test1);
        System.out.printf("test2 = %b%n, a = %d%n", test2, a);
        System.out.printf("test3 = %b%n, a = %d%n", test3, a);
    }
}
