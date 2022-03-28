package by.belova.autotest01.main;

/* Ввести целые числа как аргументы командной строки,
подсчитать их сумму (произведение) и вывести результат на консоль.
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        double a = enterDouble("a");
        double b = enterDouble("b");
        double multipl = a * b;
        if ((a >= Double.MAX_VALUE && b >= Double.MAX_VALUE) || (a <= -Double.MAX_VALUE && b <= -Double.MAX_VALUE)) {
            multipl = Double.POSITIVE_INFINITY;
        }
        if ((a >= Double.MAX_VALUE && b <= -Double.MAX_VALUE) || (a <= -Double.MAX_VALUE && b >= Double.MAX_VALUE)) {
            multipl = Double.NEGATIVE_INFINITY;
        }
        double add = a + b;
        if (a >= Double.MAX_VALUE && b >= Double.MAX_VALUE) {
            add = Double.POSITIVE_INFINITY;
        }
        if (a <= -Double.MAX_VALUE && b <= -Double.MAX_VALUE) {
            add = Double.NEGATIVE_INFINITY;
        }
        System.out.println("a * b = " + multipl);
        System.out.println("a + b = " + add);
    }

    public static double enterDouble(String argument) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + argument + " :");
        double r;
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Enter " + argument + " :");
        }
        r = sc.nextDouble();
        return r;
    }
}
