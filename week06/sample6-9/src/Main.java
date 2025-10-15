import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int CIGA = 7; // 담배 1개피당 단축되는 수명 (분)
        int year;           // 흡연 연수
        int gapi;           // 하루 흡연 개비 수
        long result;        // 총 단축된 수명(분)
        long hours;         // 총 단축 시간(시간 단위)

        // 입력 받기
        System.out.print("당신은 하루에 몇 개피의 담배를 피우나요? : ");
        gapi = keyboard.nextInt();

        System.out.print("당신은 몇 년 동안 담배를 피웠나요? : ");
        year = keyboard.nextInt();

        // 계산
        result = (long) gapi * year * 365 * CIGA; // 총 단축된 수명(분)
        hours = result / 60;                       // 시간 단위 변환

        // 출력
        System.out.printf("담배 1개피는 수명을 %d분 단축합니다.%n", CIGA);
        System.out.printf("당신은 %d년 동안 하루 평균 %d개비를 피웠습니다.%n", year, gapi);
        System.out.printf("그러면 수명이 %,d분 (약 %,d시간) 단축됩니다.%n", result, hours);

        keyboard.close();
    }
}
