import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("급여액을 입력하세요(단위: 원): ");
        int salary = sc.nextInt();
        double tax = 0;

        if (salary < 2000000) {
            tax = 0;
        } else if (salary <= 4000000) {
            tax = (salary - 2000000) * 0.10;
        } else if (salary <= 6000000) {
            tax = (salary - 2000000) * 0.08;
        } else if (salary <= 20000000) {
            tax = (salary - 2000000) * 0.06;
        } else if (salary <= 30000000) {
            tax = (salary - 2000000) * 0.05;
        }

        System.out.println("급여: " + salary + "원");
        System.out.println("세금: " + (int)tax + "원");
    }
}
