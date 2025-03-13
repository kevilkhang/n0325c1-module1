package ss5_loop;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        int factorialA = 1, factorialB = 1, factorialC = 1;

        do {
            System.out.print("Nhap so nguyen duong a: ");
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Vui long nhap vao so duong!");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhap so nguyen duong b: ");
            b = scanner.nextInt();

            if (b <= 0) {
                System.out.println("Vui long nhap vao so duong!");
            }
        } while (b <= 0);

        do {
            System.out.print("Nhap so nguyen duong c: ");
            c = scanner.nextInt();

            if (c <= 0) {
                System.out.println("Vui long nhap vao so duong!");
            }
        } while (c <= 0);

        // B2: Tinh giai thua cua a, b, c
        // Tinh giai thua cua a
        for (int i = 1; i <= a; i++) {
            factorialA *= i;
        }

        // Tinh giai thua cua b
        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }

        // Tinh giai thua cua c
        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }

        // B3: Cong cac giai thua de tinh S
        int s = factorialA + factorialB + factorialC;

        // B4: In ra
        System.out.printf("Tong cua %d! + %d! + %d! = %d", a, b, c, s);
    }


}
