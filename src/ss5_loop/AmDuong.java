package ss5_loop;

import java.util.Scanner;

/**
 * In day so 2, -4, 6 , -8 , 10 ... n (n la so nhap vao tu ban phim)
 */
public class AmDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        // Lap tu 2 den n voibuoc nhay la 2
        for (int i = 2; i <= n; i += 2) {

            // Kiem tra i % 4 == 0
            if (i % 4 == 0) {
                System.out.print(-i + " ");
            } else {
                // Nguoc lai
                System.out.print(i + " ");
            }
        }
    }
}
