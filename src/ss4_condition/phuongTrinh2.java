package ss4_condition;

import java.util.Scanner;

/**
 * Giai phuong trinh bac 2 co dang: ax2 + bx + c = 0
 */
public class phuongTrinh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao ba he so a, b, c
        System.out.print("Nhap vao he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao he so c: ");
        double c = scanner.nextDouble();

        // Kiem tra he so a
        if (a == 0) {
            // Neu a = 0, phuong trinh tro thanh phuong trinh bac 1
            System.out.println("Phuong trinh tro thanh phuong trinh bac 1: " + b + "x + " + c + " = 0");
            if (b != 0) {
                // Cong thuc phuong trinh bac 1 x = -c / b
                double x = -c / b;
                System.out.println("Nghiem cua phuong trinh la: x = " + x);
            } else {
                // Neu b = 0, kiem tra c
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }
        } else {
            // Neu a khac 0, tinh delta
            double delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);

            // Kiem tra gia tri cua delta
            if (delta < 0) {
                // Neu delta < 0, phuong trinh vo nghiem
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                // Neu delta = 0, phuong trinh co mot nghiem duy nhat
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co mot nghiem duy nhat: x = " + x);
            } else {
                // Neu delta > 0, phuong trinh có hai nghiem phan biet
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }
}
