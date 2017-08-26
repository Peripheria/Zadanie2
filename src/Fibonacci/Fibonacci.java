package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    @SuppressWarnings("resource")
    public static void main(String args[]) {

        log("Введите число:");
        int number = new Scanner(System.in).nextInt();

        log("Числа Фибоначчи:" + number);
        for (int i = 1; i <= number; i++) {
            log(FR(i) + " ");
        }

    }

    public static int FR(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return FR(number - 1) + FR(number - 2); // tail recursion
    }

    private static void log(String number) {
        System.out.println(number);

    }

}
