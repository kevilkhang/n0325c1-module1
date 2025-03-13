package ss5_loop;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1: Nhap chieu dai canh cua hinh
        System.out.print("Nhap mot so nguyen duong n: ");
        int n = scanner.nextInt();

        // B2: Khoi tao mot bien de luu tru chuoi nhi phan
        String binary ="";

        // B3: Chuyen doi n thanh he nhi phan
        while (n > 0) {
            int remainder = n % 2; // Lay phan du chia cho 2
            binary = remainder + binary; // Them phan du vao dau chuoi nhi phan
            n = n / 2; // Chia n cho 2
        }

        // B4:
        System.out.println("So nhi phan tuong ung la: " + binary);
    }
}
