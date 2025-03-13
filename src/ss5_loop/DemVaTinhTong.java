package ss5_loop;

import java.util.Scanner;

public class DemVaTinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1: Nhap hai so nguyen duong a, b
        System.out.print("Nhap so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b (b > a): ");
        int b = scanner.nextInt();

        int soLuongSoDoiXung = 0;
        int tongSoDoiXung = 0;

        int soLuongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;

        int soLuongSoNguyenTo = 0;
        int tongSoNguyenTo = 0;

        // B2: Kiem tra tung so trong doan [a, b]
        for (int n = a; n <= b; n++) {
            // Kiem tra so doi xung
            String str = Integer.toString(n);
            boolean isPaLindrome = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPaLindrome = false;
                    break;
                }
            }

            if (isPaLindrome) {
                soLuongSoDoiXung++;
                tongSoDoiXung += n;
            }

            if (Math.sqrt(n) % 1 == 0) {
                soLuongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }

            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                soLuongSoNguyenTo++;
                tongSoNguyenTo += n;
            }
        }

        // B4:
        System.out.printf("So doi xung trong doan [%d, %d]: %d\n", a, b, soLuongSoDoiXung);
        System.out.printf("Tong so doi xung trong doan [%d, %d]: %d\n", a, b, tongSoDoiXung);
        System.out.printf("So chinh phuong trong doan [%d, %d]: %d\n", a, b, soLuongSoChinhPhuong);
        System.out.printf("Tong so chinh phuong trong doan [%d, %d]: %d\n", a, b, tongSoChinhPhuong);
        System.out.printf("So nguyen to trong doan [%d, %d]: %d\n", a, b, soLuongSoNguyenTo);
        System.out.printf("Tong so nguyen to trong doan [%d, %d]: %d\n", a, b, tongSoNguyenTo);

    }
}
