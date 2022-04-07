package by.belova.autotest01.optional2;

/*  Ввести с консоли n-размерность матрицы a[n][n].
Задать значения элементов матрицы в интервале значений
от -М до М с помощью генератора случайных чисел.

Найти и вывести наибольшее число возрастающих (убывающих)
элементов матрицы, идущих подряд.
 */

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int n = enterInt("matrix dimention");
        int m = enterInt("M"); // верхний предел значений матрицы
        int matrix[][] = createMatrix(n, m);
        outputMatrix(matrix, n);
        System.out.println(calculatorOfOrderedNumbers(matrix, n));
        System.out.println(calculatorOfReverseOrderedNumbers(matrix, n));
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
        if (v < 0) {
            v = -v;
        }
        sc.close();
        return v;
    }

    public static int[][] createMatrix(int n, int m) {

        Random r = new Random();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (r.nextDouble() * 2 * m - m);
            }
        }
        return matrix;
    }

    public static int calculatorOfOrderedNumbers(int[][] matrix, int n) {
        int[] array = new int[n * n];  // перевод матрицы в одномерный массив

        for (int i = 0, k = 0; i < n; i++) {
            for (int j = 0; j < n; j++, k++) {
                array[k] = matrix[i][j];
            }
        }

        int maxCount = 0;
        for (int i = 0; i < n * n - 1; i++) {
            int count = 1;
            while (i < n * n - 1 && array[i] < array[i + 1]) {
                count++;
                i++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static int calculatorOfReverseOrderedNumbers(int[][] matrix, int n) {
        int[] array = new int[n * n];  // перевод матрицы в одномерный массив

        for (int i = 0, k = 0; i < n; i++) {
            for (int j = 0; j < n; j++, k++) {
                array[k] = matrix[i][j];
            }
        }

        int maxCount = 0;
        for (int i = 0; i < n * n - 1; i++) {
            int count = 1;
            while (i < n * n - 1 && array[i] > array[i + 1]) {
                count++;
                i++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static void outputMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
