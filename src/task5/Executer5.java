package task5;

import java.util.Scanner;

public class Executer5 {
    public static void recursive_function_1() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 0) {
            return;
        }

        if (x % 2 == 1) {
            System.out.print(x + " ");
        }

        recursive_function_1();
    }

    public static void recursive_function_2_odd() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 0) {
            return;
        }

        System.out.print(x + " ");

        recursive_function_2_even();
    }

    public static void recursive_function_2_even() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 0) {
            return;
        }

        recursive_function_2_odd();
    }

    public static void recursive_function_3(int number, boolean first_time) {
        if (number == 0) {
            if (!first_time) {
                return;
            }
        }

        recursive_function_3(number / 10, false);

        System.out.print((number % 10) + " ");
    }

    public static void execute() {
        System.out.println("Введите последовательность чисел, оканчивающуюся нулём.");
        recursive_function_1();

        System.out.println("\nВведите последовательность чисел, оканчивающуюся нулём.");
        recursive_function_2_odd();

        System.out.println("\nВведите число.");
        Scanner in = new Scanner(System.in);
        recursive_function_3(in.nextInt(), true);
    }
}
