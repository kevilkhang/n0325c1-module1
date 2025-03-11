package ss5_loop;

import java.util.Scanner;

/**
 * In day so 1,2,3,4,5 ...n (n la so nguyen nhap vao tu ban phim)
 */
public class InDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }
}
