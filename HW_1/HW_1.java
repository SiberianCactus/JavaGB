// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class HW_1  {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Сумма чисел: %d\n", giveMeNumber(i));
        System.out.printf("Факториал: %d\n", factorial(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int factorial(int a) {
        if (a != 0) {
           return a * factorial(a-1);
        } 
        return 1;
    }
}