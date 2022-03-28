package by.belova.autotest01.main;

// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first argument: ");
        String firstArgument = sc.nextLine();

        System.out.println("Enter second argument: ");
        String secondArgument = sc.nextLine();

        System.out.println("Enter third argument: ");
        String thirdArgument = sc.nextLine();

        System.out.println(thirdArgument + " " + secondArgument + " " + firstArgument);

    }
}
