import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        int won = 0;
        float convert;
        float dollar = 0.0f;





        System.out.println("원화 %,d원은 %,f 달러($) 입니다./n , won dollar");
        convert = Keyboard.nextFloat();
        System.out.println("원화 %,d원은 %,f 달러($) 입니다./n , won dollar");
        won = Keyboard.nextFloat();

        dollar = won / convert