// 3) Реализовать простой калькулятор
import java.util.Scanner;

public class HW_3 {
     public static void main(String[] args) {
          Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите выражение: ");
           String[] array = new String[3];

           for (int i = 0; i < array.length; i++){
                array[i] = iScanner.next();
           }

        iScanner.close();

    int first_Number = Integer.parseInt(array[0]);
    int second_Number = Integer.parseInt(array[2]);


        switch (array[1]){
        case ("+"): 
        System.out.print(sum(first_Number, second_Number));
        break;
       case("-"): 
         System.out.print(subtraction(first_Number, second_Number));
        break;
        case("*"): 
      System.out.print(multiplication(first_Number, second_Number));
        break;
        case(":"): 
        case("/"): 
      System.out.print(deviding(first_Number, second_Number));
        break;
        }
     }

public static int sum(int a, int b){
    return a + b;
}
public static int subtraction(int a, int b){
    return a - b;
}
public static int multiplication(int a, int b){
    return a * b;
}
public static int deviding(int a, int b){
    return a / b;
}
}
