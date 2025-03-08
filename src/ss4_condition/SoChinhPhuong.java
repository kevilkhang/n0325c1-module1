package ss4_condition;

import java.util.Scanner;

/**
 * Kiem tra 1 so nguyen duong x co phai la so chinh phuong hay khong? Dinh nghia so chinh phuong: La so ma ket qua khai can bac 2 cua no la 1 so nguyen. vd: 0, 1, 4, 9, 16, 25, 36 ...
 */
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap mot so nguyen duong
        System.out.print("Nhap mot so nguyen duong: ");
        int x = scanner.nextInt();

        // Tinh can bac hai cua x
        double canBacHai = Math.sqrt(x);

        // Kiem tra canBacHai la so nguyen (thap phan = 0, % 1 == 0)
        if (canBacHai % 1 == 0) {
            System.out.println(x + " la so chinh phuong");
        } else {
            System.out.println(x + " khong phai la so chinh phuong");
        }
    }
}
