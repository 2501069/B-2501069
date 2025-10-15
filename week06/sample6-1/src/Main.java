public class Main {
    public static void main(String[] args) {

        final int korea = 99720;
        final int northkorea = 122762;
        final int usa = 9631418;
        final int japan = 377873;

        float temp1 = (float) northkorea / korea;
        float temp2 = (float) usa / korea;
        float temp3 = (float) japan / korea;

        System.out.printf("대한민국의 면적 : %,d km²%n", korea);
        System.out.printf("북한의 면적 : %,d km²%n", northkorea);
        System.out.printf("미국의 면적 : %,d km²%n", usa);
        System.out.printf("일본의 면적 : %,d km²%n", japan);

        System.out.printf("북한은 우리나라에 비해 %.2f배임.%n", temp1);
        System.out.printf("미국은 우리나라에 비해 %.2f배임.%n", temp2);
        System.out.printf("일본은 우리나라에 비해 %.2f배임.%n", temp3);
    }
}










