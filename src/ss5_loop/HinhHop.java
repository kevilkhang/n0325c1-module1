package ss5_loop;

import java.util.Scanner;

public class HinhHop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1:
        System.out.print("Nhap vao chieu dai canh cua hinh vuong: ");
        int chieuDaiCanh = scanner.nextInt();

        // Buoc 2:
        for (int i = 1; i <= chieuDaiCanh; i++) { // i dai dien cho dong, vong lap cha
            for (int j = 1; j <= chieuDaiCanh; j++) { // j dai dien cho cot, vong lap con

                // Buoc 3:
                if (i == 1 || i == chieuDaiCanh || j == 1 || j == chieuDaiCanh) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            // Xuong dong sau khi hoan thanh mot hang
            System.out.println();
        }
    }
}
