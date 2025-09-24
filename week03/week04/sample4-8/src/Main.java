import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int salary, bonus;
        int total, tax;


        System.out.println("본봉 입력:");
        salary = Keyboard.nextInt();
        System.out.println("보너스 입력:");
        salary = Keyboard.nextInt();


        total = salary + bonus;
        tax = (int) (total * (8.0f / 100))
        tax /= 100;
        tax *= 100;
           System.out.println("보봉은 %,d원/n, salary");
           System.out.println(|:"보너스는 %,d 원/n,bonus");
        System.out.println(|:"보너스는 %,d 원/n,total");
        System.out.println(|:"보너스는 %,d 원/n,tax");
        System.out.println(|:"보너스는 %,d 원/n,total -tax" );