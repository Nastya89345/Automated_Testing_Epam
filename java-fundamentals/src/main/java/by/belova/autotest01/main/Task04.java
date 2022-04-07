package by.belova.autotest01.main;

/* Ввести целые числа как аргументы командной строки,
подсчитать их сумму (произведение) и вывести результат на консоль.
 */


public class Task04 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int multipl = a * b;
            if ((a >= Integer.MAX_VALUE && b >= Integer.MAX_VALUE) || (a <= -Integer.MAX_VALUE && b <= -Integer.MAX_VALUE)) {
                multipl = Integer.MAX_VALUE;
            }
            if ((a >= Integer.MAX_VALUE && b <= -Integer.MAX_VALUE) || (a <= -Integer.MAX_VALUE && b >= Integer.MAX_VALUE)) {
                multipl = Integer.MIN_VALUE;
            }
            int add = a + b;
            if (a >= Integer.MAX_VALUE && b >= Integer.MAX_VALUE) {
                add = Integer.MAX_VALUE;
            }
            if (a <= -Integer.MAX_VALUE && b <= -Integer.MAX_VALUE) {
                add = Integer.MIN_VALUE;
            }
            System.out.println("a * b = " + multipl);
            System.out.println("a + b = " + add);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format." + e);
        }
    }
}
