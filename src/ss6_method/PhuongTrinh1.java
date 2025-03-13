package ss6_method;

import java.util.Scanner;

public class PhuongTrinh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao he so b: ");
        double b = scanner.nextDouble();

        System.out.println("Ket qua cua phuong trinh bac nhat");
        levelOne(a, b);
    }

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh vo so nghiem"); // a = 0, b = 0 -> pt vo so nghiem
            } else {
                System.out.println("Phuong trinh vo nghiem"); // b # 0 -> pt vo nghiem
            }
        } else {
            // Neu a # 0, tim nghiem pt (chia -b cho a)
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
    }
}
