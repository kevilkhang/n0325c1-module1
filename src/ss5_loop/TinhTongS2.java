package ss5_loop;

import java.util.Scanner;

public class TinhTongS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cach 2:
        // Buoc 1:
        System.out.print("Nhap vao so nguyen duong n tu ban phim: ");
        int n = scanner.nextInt();

        // Buoc 2:
        double sum = 0.0;
        int fact = 1;

        // Buoc 3:
        for (int i = 1; i <= n; i++) {
            // Buoc 4:
            sum += 1.0 / fact;
            fact += (2 * i) * (2 * i + 1);
        }
        System.out.println("Tong S: " + sum);
    }
}
