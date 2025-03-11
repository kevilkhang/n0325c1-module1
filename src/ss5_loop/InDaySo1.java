package ss5_loop;

import java.util.Scanner;

public class InDaySo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1:
        System.out.print("Nhap vao so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        // Buoc 2:
        int a = 1;

        // Buoc 3:
        while (a <= n) {
            // Buoc 4:
            System.out.print(a + " ");
            a = 2 * a + 1;
        }
        // Buoc 5:
    }
}
