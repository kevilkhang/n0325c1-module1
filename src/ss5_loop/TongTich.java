package ss5_loop;

import java.util.Scanner;

public class TongTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1:
        System.out.print("Nhap vao so nguyen m tu ban phim: ");
        int m = scanner.nextInt();

        // Buoc 2:
        int s = 0;
        int p = 1;

        // Buoc 3:
        while (m > 0) {
            // Buoc 4:
            int digit = m % 10;
        // Buoc 5:
            s = s + digit;
            p = p * digit;
        // Buoc 6:
            m = m / 10;
        }
        // Buoc 7:
        System.out.println("Tong cac chu so la: " + s);
        System.out.println("Tich cac chu so la: " + p);
    }
}
