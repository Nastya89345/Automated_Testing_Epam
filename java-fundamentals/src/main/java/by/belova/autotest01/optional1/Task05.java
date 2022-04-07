package by.belova.autotest01.optional1;

/* Найти количество чисел, содержащих только чётные цифры,
а среди оставшихся - количество чисел с равным числом
чётных и нечетных цифр.
 */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int array[] = createArray(n);
        evenOdd(array);
    }

    public static int enterInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + message + ": ");
        int v;
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Enter " + message + ": ");
        }
        v = sc.nextInt();
        sc.close();
        return v;
    }

    public static int[] createArray(int n) {

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = enterInt("value");
        }
        return mas;
    }

    public static void evenOdd(int[] array) {
        int counterEven = 0;
        int counterEqual = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            int countEven = 0;
            int countOdd = 0;
            while (a > 0) {
                if (a % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
                a = a / 10;
            }
            if (countOdd == 0) {
                counterEven++;
            }
            if (countEven == countOdd) {
                counterEqual++;
            }
        }
        System.out.println("Количество чисел, содержащих только чётные цифры: " + counterEven);
        System.out.println("Количество чисел с равным числом чётных и нечётных цифр: " + counterEqual);
    }

}
