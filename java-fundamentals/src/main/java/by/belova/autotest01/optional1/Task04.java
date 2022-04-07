package by.belova.autotest01.optional1;

/* Найти число, в котором количество различных цифр минимально.
Если таких чисел несколько, найти первое из них.
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int array[] = createArray(n);
        int array2[] = differentNumbers(array); // массив со значением количества различных цифр из массива array
        int result = array[minDifference(array2)];
        System.out.println(result);
        int array3[] = null;
        minDifferentNumbers(array3);
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

    public static int[] differentNumbers(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            String number = Integer.toString(Math.abs(array[i]));
            int count = 0;
            for (int j = 0; j < number.length() - 1; j++) {
                for (int k = j + 1; k < number.length(); k++) {
                    if (number.charAt(j) == number.charAt(k)) {
                        count++;
                        break;
                    }
                }
            }
            if (count > 0) {
                count++; // количество одинаковых цифр
            }
            int difference = number.length() - count;
            array2[i] = difference;

        }
        return array2;
    }

    public static int minDifference(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) {
                min = array[i + 1];
                index = i + 1;
            }
        }
        return index;
    }
    // второй вариант (без создания второго массива):
    public static void minDifferentNumbers(int[] array) {
        if (array == null) {
            System.out.println("array is null");
        } else {
            int min = Integer.toString(array[0]).length();
            int minArr = 0; // результат
            for (int a : array) { // для каждого числа массива
                String s = Integer.toString(a);
                int count = 0; // количество групп одинаковых цифр в числе
                for (int i = 0; i < s.length(); i++) { // для каждой цифры числа

                    boolean mark = false;
                    for (int k = 0; k < i; k++) { // для каждой цифры до i
                        if (s.charAt(i) == s.charAt(k)) {
                            mark = true;
                            break;
                        }
                    }
                    if (!mark) {
                        count++;
                    }
                }
                if (count < min) {
                    min = count;
                    minArr = a;
                }

            }
            System.out.println(minArr);
        }
    }
}
