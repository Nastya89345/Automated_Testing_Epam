package by.belova.autotest01.optional2;

/* Ввести с консоли n-размерность матрицы a[n][n].
Задать значения элементов матрицы в интервале значений
от -М до М с помощью генератора случайных чисел.

Упорядочить строки (столбцы) матрицы в порядке возрастания
значений элементов k-го столбца (строки).
 */

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int n = enterInt("matrix dimention");
        int m = enterInt("M"); // верхний предел значений матрицы
        int column = enterK(n);
        int line = enterK(n);
        int matrix[][] = createMatrix(n, m);
        int matrix2[][] = sortByColumn(matrix, column, n);
        int matrix3[][] = sortByLine(matrix,line, n);

        outputMatrix(matrix, n);
        outputMatrix(matrix2, n);
        outputMatrix(matrix3, n);

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

    public static int enterK(int n) {
        int k;
        do {
            k = enterInt("K");
        } while (k < 0 || k > (n - 1));
        return k;

    }

    public static int[][] sortByColumn(int[][] matrix, int column, int n) {

        int[][] matrixM = new int[n][n];       // копия исходной матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixM[i][j] = matrix[i][j];
            }
        }

        boolean sorted = false;    // сортировка строк копии матрицы по значениям столбца k
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (matrixM[i][column] > matrixM[i + 1][column]) {
                    for (int j = 0; j < n; j++) {
                        int temp = matrixM[i][j];
                        matrixM[i][j] = matrixM[i + 1][j];
                        matrixM[i + 1][j] = temp;
                    }
                    sorted = false;
                }
            }
        }
        return matrixM;
    }

    public static int[][] sortByLine(int[][] matrix, int line, int n) {

        int[][] matrixN = new int[n][n];       // копия исходной матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixN[i][j] = matrix[i][j];
            }
        }

        boolean sorted = false; // сортровка столбцов матрицы по значению строки k
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (matrixN[line][j] > matrixN[line][j + 1]) {
                    for (int i = 0; i < n; i++) {
                        int temp = matrixN[i][j];
                        matrixN[i][j] = matrixN[i][j + 1];
                        matrixN[i][j + 1] = temp;
                    }
                    sorted = false;
                }
            }
        }
        return matrixN;
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
