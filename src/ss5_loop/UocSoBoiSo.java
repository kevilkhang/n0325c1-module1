package ss5_loop;

import java.util.Scanner;

public class UocSoBoiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cach 1:
        // Buoc 1:
        System.out.print("Nhap vao so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so nguyen duong b: ");
        int b = scanner.nextInt();

        // Buoc 2:
        int uscln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 &&  b % i == 0) {
                uscln = i;
                break;
            }
        }

        // Buoc 3:
        int bscnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;
            }
        }

        // Buoc 4:
        System.out.println("Uoc so chung lon nhat la: " + uscln);
        System.out.println("Boi so chung nho nhat la: " +bscnn);

    }
}
