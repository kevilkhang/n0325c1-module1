package ss5_loop;

import java.util.Scanner;

/**
 * In day so 1, 2, 3, 5, 8, 13, ...n (n la so nhap vao tu ban phim)
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.print(fn + "\t");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
