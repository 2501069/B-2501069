//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b= -a;
        int c = a++ + 2 - --b;
        // c = a + 2;
        // a = a+ 1;    -4
        // a = a+ 1;     6
        int d = (((a--) + ) + 2);
        //b = b + 1;    -5
        // d = b + 2; 3
        // a - b = 1;       5

        float e = (float) (5.0 / 4);

         a += 4; // a = a+ 4
        System.out.println("a = %d, b = %d, c = %d, d = *d, e = %.2f/n"
        a, b, c, d,);