package ss5_loop;

import java.util.Scanner;

/**
 * In day so 2,4,6,8,10... 2n (n la so nhap vao tu ban phim)
 */
public class SoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
