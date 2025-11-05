public class Main {
    public static void main(String[] args) {

        // 3세트 반복
        for (int set = 1; set <= 3; set++) {
            System.out.printf("Set : %d%n", set);

            int i = 1;
            // 각 세트당 20회 반복
            do {
                System.out.printf("팔굽혀펴기 : %2d 회%n", i);
                i++;
            } while (i <= 20);

            System.out.println(); // 세트 간 줄바꿈
        }
    }
}
