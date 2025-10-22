import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours;
        String result;
        int baseSalary;   // 기본급
        int extraSalary = 0; // 초과 수당

        System.out.print("주당 근무 시간 입력: ");
        hours = keyboard.nextInt();

        if (hours > 40) {
            baseSalary = 11500 * 40; // 기본 40시간 급여
            extraSalary = (int) ((hours - 40) * 11500 * 1.5); // 초과 근무 수당
            result = String.format("급여는 기본급 %,d원 + 초과 수당 %,d원 = 총 %,d원 입니다.",
                    baseSalary, extraSalary, baseSalary + extraSalary);
        } else {
            baseSalary = 11500 * hours;
            result = String.format("급여는 %,d원 입니다.", baseSalary);
        }

        System.out.println(result);
    }
}
