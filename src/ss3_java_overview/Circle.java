package ss3_java_overview;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai bao hang so Pi
        double pi = 3.14159;

        // Nhap ban kinh cua hinh tron
        System.out.print("Nhap ban kinh cua hinh tron: ");
        int banKinh = Integer.parseInt(scanner.nextLine());

        // Chu vi cua hinh tron
        double chuVi = 2 * pi * banKinh;

        // Dien tich cua hinh tron
        double dienTich = banKinh * banKinh * pi;

        // In ket qua
        System.out.println("Chu vi cua hinh tron la: " + chuVi);
        System.out.println("Dien tich cua hinh tron la: " + dienTich);
    }
}
