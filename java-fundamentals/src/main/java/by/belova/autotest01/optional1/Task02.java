package by.belova.autotest01.optional1;

// Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int mas[] = createArray(n);
        int masSort[] = sortingArray(mas);
        enterSortedArray(masSort); // вывод чисел в порядке убывания
        int masSor[] = sortingArrayAscending(mas);
        enterSortedArray(masSort); // вывод чисел в порядке возрастания
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

    public static int[] sortingArray(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                String number = Integer.toString(Math.abs(array[i]));
                int lengthNumber = number.length();
                String nextNumber = Integer.toString(Math.abs(array[i + 1]));
                int lengthNextNumber = nextNumber.length();
                if (lengthNextNumber > lengthNumber) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static void enterSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortingArrayAscending(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                String number = Integer.toString(Math.abs(array[i]));
                int lengthNumber = number.length();
                String nextNumber = Integer.toString(Math.abs(array[i + 1]));
                int lengthNextNumber = nextNumber.length();
                if (lengthNextNumber < lengthNumber) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
