package ss5_loop;

import java.util.Scanner;

/**
 * In day so 2, -4, 6, 8,-10, 12, 14, 16, -18, ...n (n la so nhap vao tu ban phim)
 */
public class SoChan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen n tu ban phim: ");
        int n = scanner.nextInt();
        int count = 0;
        int distance = 1;

        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                System.out.print(-i + " ");
                count = 0;
                distance++;
            } else {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
