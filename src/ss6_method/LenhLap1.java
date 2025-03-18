package ss6_method;

import java.util.Scanner;

public class LenhLap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong n: ");
        int n = scanner.nextInt();

        // Cau a
        System.out.printf("So dao cua %d: %d\n", n, reversedNumber(n));

        // Cau b
        if (isSymmetricalNumber(n)) {
            System.out.printf("%d la so doi xung\n", n);
        } else {
            System.out.printf("%d khong phai la so doi xung\n", n);
        }

        // Cau c
        if (isSquareNumber(n)) {
            System.out.printf("%d la so chinh phuong\n", n);
        } else {
            System.out.printf("%d khong phai la so chinh phuong\n", n);
        }

        // Cau d
        if (isPrimeNumber(n)) {
            System.out.printf("%d la so nguyen to\n", n);
        } else {
            System.out.printf("%d khong phai la so nguyen to\n", n);
        }

        // Cau e
        System.out.printf("Tong cac chu so le cua %d: %d\n", n, calculateTotal0ddDigits(n));

        // Cau f
        System.out.printf("Tong cac chu so nguyen to cua %d: %d\n", n, calculateTotalPrimeDigits(n));

        // Cau g
        System.out.printf("Tong cac chu so chinh phuong cua %d: %d\n", n, calculateTotalSquareDigits(n));
    }


    // Cau a
    static int reversedNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    // Cau b
    static boolean isSymmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    // Cau c
    static boolean isSquareNumber (int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    // Cau d
    static boolean isPrimeNumber (int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Cau e
    static int calculateTotal0ddDigits(int number) {
        int total = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            number /= 10;
        }

        return total;
    }

    // Cau f
    static int calculateTotalPrimeDigits(int number) {
        int total = 0;

        while (number != 0) {
            int digit = number % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }

        return total;
    }

    // Cau g
    static int calculateTotalSquareDigits(int number) {
        int total = 0;

        while (number != 0) {
            int digit = number % 10;
            if (isSquareNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }

        return total;
    }
}

