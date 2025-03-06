package ss3_java_overview;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so xe
        System.out.print("Nhap bien so xe (Toi da 5 chu so): ");
        int soXe = Integer.parseInt(scanner.nextLine());

        // Tong cac chu so cua so xe
        int tongSo = (soXe/ 10000) + (soXe / 1000 % 10) + (soXe / 100 % 10) + (soXe / 10 % 10) + (soXe % 10);

        // Lay chu so hang don vi cua tong
        int soDonVi = tongSo % 10;

        // In ra chu so hang don vi cua tong
        System.out.println("Chữ số hàng đơn vị của tổng các chữ số là: " + soDonVi);
    }
}
