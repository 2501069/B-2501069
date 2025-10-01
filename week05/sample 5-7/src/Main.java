import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("**** 정사각형 넓이 ******");

        System.out.print("가로 길이 : ");
        int width = scanner.nextInt();

        System.out.print("세로 길이 : ");
        int height = scanner.nextInt();

        int area = width * height;

        System.out.printf("가로 길이 : %d Cm%n", width);
        System.out.printf("세로 길이 : %d Cm%n", height);
        System.out.printf("넓 이 : %d Cm2%n", area);

        scanner.close();
    }
}
