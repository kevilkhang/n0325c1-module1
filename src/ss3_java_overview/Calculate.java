package ss3_java_overview;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        String name = scanner.nextLine();

        System.out.print("Nhap so luong: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap don gia: ");
        int price = Integer.parseInt(scanner.nextLine());

        // Tinh tong tien cho san pham
        int total = quantity * price;

        // Tinh thue VAT (10%) cho san pham
        double tax = total * 0.10;

        System.out.println("Tong tien cua "  + name + " la: " + total);
        System.out.println("Thue VAT (10%): " + tax);
    }
}
