package ss6_method;

import java.util.Scanner;

public class UocSoChung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so nguyen duong b: ");
        int b = scanner.nextInt();

        System.out.printf("Uoc so chung cua 2 so %d va %d la: %d", a, b, uscln(a, b));
    }

    static int uscln(int a, int b) {
        a = Math.abs(a);
        a = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }

        for (int i = min / 2; i >= i; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }
}
