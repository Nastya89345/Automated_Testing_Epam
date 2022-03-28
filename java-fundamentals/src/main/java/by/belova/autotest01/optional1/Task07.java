package by.belova.autotest01.optional1;

/* Найти число, состоящее только из различных цифр.
Если таких чисел несколько, найти первое из них.
 */

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int array[] = createArray(n);
        int result = comparer(array);
        System.out.println(result);
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

    public static int comparer(int[] array) {
        if (array == null) {
            System.out.println("array is null");
            return 0;
        } else {
            int result = 0;
            int i = 0;
            while (i < array.length) {
                String number = Integer.toString(Math.abs(array[i]));
                boolean equal = false;
                for (int j = 0; j < number.length() - 1; j++) {
                    for (int k = j + 1; k < number.length(); k++) {
                        if (number.charAt(j) == number.charAt(k)) {
                            equal = true;

                        }
                    }
                }
                if (!equal) {
                    result = array[i];
                    break;
                }
                i++;
            }
            return result;
        }
    }

}
