package ss5_loop;

import java.util.Scanner;

public class InDaySo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1:
        System.out.print("Nhap vao mot so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        // Buoc 2:
        int a = 1;

        // Buoc 3:
        int d = 1;

        // Buoc 4:
        while (a <= n) {
            // Buoc 5:
            System.out.print(a * d + " ");
            a = a * 2 + 1;

            // Buoc 6:
            d = -d;
        }
        // Buoc 7:
    }
}
