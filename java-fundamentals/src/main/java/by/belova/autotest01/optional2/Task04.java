package by.belova.autotest01.optional2;

/* Ввести с консоли n-размерность матрицы a[n][n].
Задать значения элементов матрицы в интервале значений
от -М до М с помощью генератора случайных чисел.

Найти максимальный элемент в матрице и удалить из матрицы
все строки и столбцы, его содержащие.

 */

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int n = enterInt("matrix dimention");
        int m = enterInt("M"); // верхний предел значений матрицы
        int matrix[][] = createMatrix(n, m);
        outputMatrix(matrix, n);
        exeptionMax(matrix, n);
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

    public static void outputMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exeptionMax(int[][] matrix, int n) {
        int max = 0;                // поиск максимального элемента
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }


        int countMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == max) {
                    countMax++;
                    for (int k = 0; k < n; k++) {  // удаление строки с максимальным элементом
                        matrix[k][j] = 0;
                    }
                    for (int m = 0; m < n; m++) {  // удаление столбца с максимальным элементом
                        matrix[i][m] = 0;
                    }
                }
            }
        }
        System.out.println(max + " (" + countMax + ")");
        outputMatrix(matrix, n);
    }

}
