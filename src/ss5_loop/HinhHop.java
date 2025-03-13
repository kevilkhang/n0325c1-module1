package ss5_loop;

import java.util.Scanner;

public class HinhHop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chieu dai canh cua hinh vuong: ");
        int chieuDaiCanh = scanner.nextInt();

        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == 1 || j == chieuDaiCanh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
