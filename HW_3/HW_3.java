// Задание

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package HW_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HW_3 {
     public static void main(String[] args) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("Введите размер списка: ");
          int size = iScanner.nextInt();
          System.out.printf("Введите минимальное значение для генерации рандомного списка: ");
          int min = iScanner.nextInt();
           System.out.printf("Введите максимальное значение для генерации рандомного списка: ");
          int max = iScanner.nextInt();
     iScanner.close();
     System.out.println();
          intsInRange(size, min, max);
          List<Integer> array = intsInRange(size, min, max);
          System.out.println("Список с рандомными числами: " + array);
          FindMin(array);
          FindMax(array);
          FindAverage(array);
          List<Integer> filtred = Filter(array);
          System.out.println("Отфильтрованный списоек без четных чисел: " + filtred);

     }

     public static List<Integer> intsInRange(int size, int lowerBound, int upperBound) {
          Random random = new Random();
          List<Integer> result = new ArrayList<>();
          for (int i = 0; i < size; i++) {
               result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
          }
          return result;
     }

     public static List<Integer> Filter(List<Integer> arr) {
          for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i) % 2 == 0) {
                    arr.remove(i);
                    i--;
               }
          }
          return arr;
     }

     public static void FindMin(List<Integer> arr) {
          int min = arr.get(0);
          for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i) < min) {
                    min = arr.get(i);
               }
          }
          System.out.println("Минимальное значение в списке: " + min);
     }

     public static void FindMax(List<Integer> arr) {
          int max = arr.get(0);
          for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i) > max) {
                    max = arr.get(i);
               }
          }
          System.out.println("Максимальное значение в списке: " + max);
     }

     public static void FindAverage(List<Integer> arr) {
          int sum = 0;
          int average = 0;
          for (int i = 0; i < arr.size(); i++) {
               sum += arr.get(i);
          }
          average = sum / arr.size();
          System.out.println("Среднее значение: " + average);
     }
}
