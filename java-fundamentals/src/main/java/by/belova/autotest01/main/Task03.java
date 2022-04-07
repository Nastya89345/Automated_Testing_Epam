package by.belova.autotest01.main;

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Enter number: ");
        }
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        int[] mas = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = rand.nextInt();
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < n; i++) {
            System.out.println(mas[i]);
        }
        sc.close();
    }
}
