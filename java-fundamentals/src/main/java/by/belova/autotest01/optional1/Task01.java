package by.belova.autotest01.optional1;

// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int mas[] = createArray(n);
        int maxLength = maxLength(n, mas);
        numbersOfMaxLength(n, mas, maxLength);
        int minLength = minLength(n, mas, maxLength);
        numbersOfMinLength(n, mas, minLength);
    }

    private static int[] createArray(int n) {

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = enterInt("value");
        }
        return mas;
    }

    public static int maxLength(int n, int mas[]) {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int a = Math.abs(mas[i]);
            int count = 0;
            while (a > 0) {
                a = a / 10;
                count++;
            }
            if (count > maxLength) {
                maxLength = count;
            }
        }
        System.out.println("Max length of number = " + maxLength);
        return maxLength;
    }

    private static void numbersOfMaxLength(int n, int[] mas, int maxLength) {
        System.out.print("Numbers for max length: ");
        for (int i = 0; i < n; i++) {
            String s = Integer.toString(Math.abs(mas[i]));
            int length = s.length();
            if (length == maxLength) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();
    }

    public static int minLength(int n, int[] mas, int maxLength) {
        int minLength = maxLength;
        for (int i = 0; i < n; i++) {
            String s = Integer.toString(Math.abs(mas[i]));
            int length = s.length();
            if (length < minLength) {
                minLength = length;
            }
        }
        System.out.println("Min length of number = " + minLength);
        return minLength;
    }

    public static void numbersOfMinLength(int n, int[] mas, int minLength) {
        System.out.print("Numbers for min length: ");
        for (int i = 0; i < n; i++) {
            String s = Integer.toString(Math.abs(mas[i]));
            int length = s.length();
            if (length == minLength) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();
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
}
