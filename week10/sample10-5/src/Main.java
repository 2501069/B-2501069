import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int STUDENT_COUNT = 10;

        // 1️⃣ 배열 선언
        int[] hakbun = new int[STUDENT_COUNT];
        String[] name = new String[STUDENT_COUNT];
        int[] kor = new int[STUDENT_COUNT];
        int[] eng = new int[STUDENT_COUNT];
        int[] math = new int[STUDENT_COUNT];
        int[] sum = new int[STUDENT_COUNT];
        double[] avg = new double[STUDENT_COUNT];
        int[] rank = new int[STUDENT_COUNT];

        // 2️⃣ 데이터 입력
        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.println((i + 1) + "번째 학생 정보 입력");

            System.out.print("학번: ");
            hakbun[i] = sc.nextInt();

            System.out.print("이름: ");
            name[i] = sc.next();

            System.out.print("국어 점수: ");
            kor[i] = sc.nextInt();

            System.out.print("영어 점수: ");
            eng[i] = sc.nextInt();

            System.out.print("수학 점수: ");
            math[i] = sc.nextInt();

            // 총점, 평균 계산
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3.0;

            // 등수 초기값 설정
            rank[i] = 1;

            System.out.println("-----------------------------");
        }

        // 3️⃣ 등수 계산 (총점 기준)
        for (int i = 0; i < STUDENT_COUNT; i++) {
            for (int j = 0; j < STUDENT_COUNT; j++) {
                if (sum[i] < sum[j]) {
                    rank[i]++;
                }
            }
        }

        // 4️⃣ 결과 출력
        System.out.println("\n================ 성적표 ================");
        System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
        System.out.println("=========================================");

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], sum[i], avg[i], rank[i]);
        }

        sc.close();
    }
}
