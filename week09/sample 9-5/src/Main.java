import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int korean, english, math;
        int total;
        float average;
        String result;

        System.out.println("성적 처리 프로그램");
        System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
        System.out.println("입력을 종료하려면 Ctrl + D (macOS/Linux) 또는 Ctrl + Z (Windows)를 누르세요.");
        System.out.println();

        while (true) {
            System.out.print("이름 입력: ");
            if (!keyboard.hasNext()) break; // EOF 감지 시 종료
            name = keyboard.next();

            korean = getValidScore(keyboard, "국어");

            english = getValidScore(keyboard, "영어");

            math = getValidScore(keyboard, "수학");

            total = korean + english + math;
            average = total / 3.0f;

            result = (average >= 70) ? "합격입니다." : "불합격입니다.";

            System.out.println("-----------------------------------");
            System.out.println("이름   : " + name);
            System.out.println("국어   : " + korean);
            System.out.println("영어   : " + english);
            System.out.println("수학   : " + math);
            System.out.println("총점   : " + total);
            System.out.printf("평균   : %.2f%n", average);
            System.out.println("결과   : " + result);
            System.out.println("-----------------------------------");
            System.out.println();
        }

        System.out.println("EOF로 인해 프로그램이 종료되었습니다.");
        keyboard.close();
    }

    private static int getValidScore(Scanner keyboard, String subject) {
        int score;

        while (true) {
            System.out.printf("%s 점수 입력 (0~100): ", subject);

            // EOF 체크
            if (!keyboard.hasNextInt()) {
                if (!keyboard.hasNext()) {
                    System.out.println("\n입력 종료 감지됨.");
                    System.exit(0);
                } else {
                    keyboard.next(); // 잘못된 입력 버리기
                    System.err.println("숫자를 입력하세요!");
                    continue;
                }
            }

            score = keyboard.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("ERROR: 점수는 0에서 100 사이여야 합니다!");
            } else {
                break; // 정상 입력 시 종료
            }
        }

        return score;
    }
}
