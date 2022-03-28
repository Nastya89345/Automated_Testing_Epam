package by.belova.autotest01.optional1;

/* Найти число, цифры в котором идут в строгом порядке возрастания.
если таких чисел несколько, найти первое из них.
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int array[] = createArray(n);
        orderSeeker(array);
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
        return v;
    }

    public static int[] createArray(int n) {

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = enterInt("value");
        }
        return mas;
    }

    public static void orderSeeker(int[] array) {
        int k = 0;
        while (k < array.length) {

            boolean grow = true;
            String s = Integer.toString(array[k]);
            int i = 0;
            while (i < s.length() - 1) {
                if (s.charAt(i) > s.charAt(i + 1)) {
                    grow = false;
                    break;
                }
                i++;
            }
            if (grow) {
                System.out.println(array[k]);
                break;
            }
            k++;
        }
    }
}
