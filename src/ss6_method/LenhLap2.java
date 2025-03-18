package ss6_method;

import java.util.Scanner;

public class LenhLap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen n: ");
        int n = scanner.nextInt();

        // Cau a
        System.out.printf("a. S = 1 + 2 + ... +  %d = %d\n", n, calculateSumofIntegers(n))  ;

        // Cau b
        System.out.printf("b. S = 1^2 + 2^2 + ... + %d^2 = %d\n", n, calculateSumofSquares(n));

        // Cau c
        System.out.printf("c. S = 1 + 1/2 + ... + 1/%d = %.2f\n", n, calculateSum(n));

        // Cau d
        System.out.printf("d. S = 1 * 2 * ... * %d = %d\n", n, calculateFactorial(n));

        // Cau e
        System.out.printf("e. S = 1! + 2! + ... + %d\n", n, calculateFactorialSum(n));
    }

    // Cau a: Tinh S = 1 + 2 + ... + n
    static int calculateSumofIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Cau b: Tinh S = 1^2 + 2^2 + ... + n^2
    static int calculateSumofSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Cau c: Tinh S = 1 + 1/2 + ... + 1/n
    static double calculateSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/ i;
        }
        return sum;
    }

    // Cau d: Tinh S = 1 * 2 * ... * n
    static long calculateFactorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    // Cau e: Tinh S = 1! + 2! + ... + n!
    static long calculateFactorialSum (int n) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}
