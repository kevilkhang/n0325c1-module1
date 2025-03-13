package ss6_method;

import java.util.Scanner;

public class LenhLap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen n: ");
        int n = scanner.nextInt();

        if (isPrimeNumber(n)) {
            System.out.print("n la so nguyen to");
        } else {
            System.out.print("n khong phai la so nguyen to");
        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
