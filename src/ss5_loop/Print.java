package ss5_loop;

import java.util.Scanner;

/**
 * In day so 1, 3, 5, 7, 9 ... n (n la so nhap tu ban phim)
 */
public class Print {
    public static void main(String[] args) {

        int n = 10;

        // Cach 1
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                System.out.print(i + "\t");
            }
        }

        // Cach 2
        for (int i = 1; i <= n; i +=2) {
            System.out.print(i + "\t");
        }
    }
}
