import java.util.Scanner;

public class Main {
    static final int SIZE = 6; // 로또 번호 개수 (상수)

    public static void main(String[] args) {
        int[] num = new int[SIZE]; // 번호를 저장할 배열
        Scanner scanner = new Scanner(System.in);

        System.out.println("로또 번호를 입력하세요 (1~45, 중복 불가):");

        // 6개의 숫자를 입력받음
        for (int i = 0; i < SIZE; i++) {
            while (true) {
                System.out.print((i + 1) + "번째 번호 입력: ");
                int input = scanner.nextInt();

                // 1~45 범위 체크
                if (input < 1 || input > 45) {
                    System.out.println("⚠️ 잘못된 입력입니다. 1~45 사이의 숫자를 입력하세요.");
                    continue;
                }

                // 중복 체크
                boolean duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (num[j] == input) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    System.out.println("⚠️ 이미 입력한 번호입니다. 다른 숫자를 입력하세요.");
                } else {
                    num[i] = input; // 중복이 아니면 저장
                    break; // while 탈출
                }
            }
        }

        // 결과 출력
        System.out.print("\n입력한 로또 번호: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
