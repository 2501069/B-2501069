import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문자열 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();

        // 2. 결과를 저장할 String 변수
        String result = "";

        // 3. 문자열의 각 문자를 하나씩 검사
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // 대문자 → 소문자
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
            // 소문자 → 대문자
            else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
            // 그 외(공백, 숫자, 특수문자)는 그대로
            else {
                result += ch;
            }
        }

        // 4. 결과 출력
        System.out.println("변환된 문자열: " + result);

        sc.close();
    }
}
