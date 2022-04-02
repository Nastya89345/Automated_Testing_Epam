package by.belova.autotest01.main;

/* Ввести число от 1 до 12. Вывести на консоль название месяца,
соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a number: ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Enter a number: ");
            }
            n = sc.nextInt();
        } while (n < 1 || n > 12);
        if (n == 1) {
            System.out.println("Januar");
        }
        if (n == 2) {
            System.out.println("Februar");
        }
        if (n == 3) {
            System.out.println("March");
        }
        if (n == 4) {
            System.out.println("April");
        }
        if (n == 5) {
            System.out.println("May");
        }
        if (n == 6) {
            System.out.println("June");
        }
        if (n == 7) {
            System.out.println("July");
        }
        if (n == 8) {
            System.out.println("August");
        }
        if (n == 9) {
            System.out.println("September");
        }
        if (n == 10) {
            System.out.println("October");
        }
        if (n == 11) {
            System.out.println("November");
        }
        if (n == 12) {
            System.out.println("December");
        }

    }
}
