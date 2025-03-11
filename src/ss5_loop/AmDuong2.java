package ss5_loop;

import java.util.Scanner;

/**
 * In day so 2, 4, -6, 8, 10, -12 ... n (bang it nhat 2 cach nhau) (n la so nhap tu ban phim)
 */
public class AmDuong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cach 1:
        System.out.print("Nhap vao mot so nguyen  tu ban phim: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }

        // Cach 2:
        // Khai bao
        int distance = 3; // Khoang cach co dinh
        int count = 0;

        for (int i = 2; i <= n; i += 2) {
            count++; // Tang bien count len 1

            // Kiem tra gia tri cua count
            if (count == distance) {
                System.out.print(-i + " ");
                count = 0; // Dat lai count neu da in ra;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
