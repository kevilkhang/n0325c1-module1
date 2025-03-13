package ss5_loop;

import java.util.Scanner;

public class HinhTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chieu dai canh cua tam giac: ");
        int chieuDaiCanh = scanner.nextInt();

        // Hinh a
        System.out.println("== Hinh a ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hinh b
        System.out.println("== Hinh b ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hinh c
        System.out.println("== Hinh c ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hinh d
        System.out.println("== Hinh d ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= chieuDaiCanh - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hinh e
        System.out.println("== Hinh e ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh - i + 1; j++) {
                if (i == 1 || j == 1 || j == chieuDaiCanh - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Hinh f
        System.out.println("== Hinh f ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j <= chieuDaiCanh - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hinh g
        System.out.println("== Hinh g ==");
        for (int i = 1; i <= chieuDaiCanh; i++) {
            for (int j = 1; j < 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (chieuDaiCanh - i) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
