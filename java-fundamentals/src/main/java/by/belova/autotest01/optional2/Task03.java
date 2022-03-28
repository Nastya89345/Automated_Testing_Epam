package by.belova.autotest01.optional2;

/*  Ввести с консоли n-размерность матрицы a[n][n].
Задать значения элементов матрицы в интервале значений
от -М до М с помощью генератора случайных чисел.

Найти сумму элементов матрицы, расположенных между первым и вторым
положительными элементами каждой строки.
 */

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int n = enterInt("matrix dimention");
        int m = enterInt("M"); // верхний предел значений матрицы
        int matrix[][] = createMatrix(n, m);
        outputMatrix(matrix, n);
        calculator(matrix,n);
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

    public static void calculator (int[][] matrix, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(matrix[i][j]>0){
                    int sum = 0;
                    for(int k = j+1; matrix[i][k]<0&&k<n; k++){
                        sum = sum+matrix[i][k];
                        if(k==n-1){
                            sum=0;
                        }
                    }
                    System.out.println(i+": "+sum);
                    break;
                }
            }
        }
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
