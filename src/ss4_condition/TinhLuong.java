package ss4_condition;

import java.util.Scanner;

/**
 * Viet chuong trinh tinh luong cua nhan vien dua theo tham nien cong tac (TNCT)
 */
public class TinhLuong {
    public static void main(String[] args) {
        // Khai bao
        double luongCanBan = 650000;
        double heSo = 0;
        double luong;
        int thamNienCongTac;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tham nien cong tac (thang): ");
        thamNienCongTac = scanner.nextInt();

        // Xac dinh he so luong
        if (thamNienCongTac < 12) {
            heSo = 1.92;
        } else {
            if (thamNienCongTac < 36) {
                heSo = 2.34;
            } else {
                if (thamNienCongTac < 60) {
                    heSo = 3;
                } else {
                    heSo = 4.5;
                }
            }
        }

        // Tinh luong
        luong = heSo * luongCanBan;

        // In ket qua
        System.out.println("Luong cua nhan vien la: " + luong + " $");

        // Đóng scanner
        scanner.close();
    }
}
