package by.belova.autotest01.optional1;

/* Вывести на консоль те числа, длина которых меньше (больше)
средней длины по всем числам, а также длину.
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int n = enterInt("amount of numbers"); // длина массива
        int array[] = createArray(n);
        double averageLength = averageLength(array);
        System.out.println("Среднее значение: " + averageLength);
        outputHigher(array, averageLength);
        outputLower(array, averageLength);
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

    public static double averageLength(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            String number = Integer.toString(Math.abs(array[i]));
            double length = number.length();
            sum = sum + length;
        }
        double average = sum / array.length;
        return average;
    }

    public static void outputHigher(int[] array, double averageLength) {
        System.out.println("Числа длиной больше средней (и их  длина): ");
        for (int i = 0; i < array.length; i++) {
            String number = Integer.toString(Math.abs(array[i]));
            int length = number.length();
            if ((double)length > averageLength) {
                System.out.println(array[i] + "(" + length + ")  ");
            }
        }
    }

    public static void outputLower(int[] array, double averageLength) {
        System.out.println("Числа длиной меньше средней (и их  длина): ");
        for (int i = 0; i < array.length; i++) {
            String number = Integer.toString(Math.abs(array[i]));
            int length = number.length();
            if ((double)length < averageLength) {
                System.out.println(array[i] + "(" + length + ")  ");
            }
        }
    }
}
