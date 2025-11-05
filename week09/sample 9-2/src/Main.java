import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int LAST = 100;
        int sum = 0;
        int start, end;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("어디부터 더할까요? ");
            start = keyboard.nextInt();

            System.out.print("어디까지 더할까요? ");
            end = keyboard.nextInt();

            if (start >= end) {
                System.out.println("ERROR: start가 end보다 작아야 합니다.");
            } else if (end > LAST) {
                System.out.println("ERROR: end는 " + LAST + "보다 작거나 같아야 합니다.");
            } else {
                break;
            }
        }

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.printf("%d + ... + %d = %,d%n", start, end, sum);
    }
}
