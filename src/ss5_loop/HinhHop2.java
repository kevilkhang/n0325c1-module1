package ss5_loop;

import java.util.Scanner;

public class HinhHop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chieu dai canh cua hinh vuong: ");
        int chieuDaiCanh = scanner.nextInt();

        // Hinh a
        System.out.println("== Hinh a ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Hinh b
        System.out.println("== Hinh b ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == 1 || i == chieuDaiCanh || j == chieuDaiCanh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Hinh c
        System.out.println("== Hinh c ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh; j++) {
                if (i == chieuDaiCanh || j == 1 || j == chieuDaiCanh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
