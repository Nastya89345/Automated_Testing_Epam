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
        switch (n) {
            case 1 -> System.out.println("Januar");
            case 2 -> System.out.println("Februar");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Error");
        }
        sc.close();
    }
}
