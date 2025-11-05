public class Main {
    public static void main(String[] args) {

        // 단순 반복 출력
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");

        System.out.println();

        // for문을 이용한 반복
        for (int i = 0; i < 10; i++) {
            System.out.println("I love you.");
        }

        System.out.println();

        // while문을 이용한 반복
        int i = 0;
        while (i < 10) {
            System.out.println("I love you.");
            i++;
        }

        System.out.println();
    }
}
