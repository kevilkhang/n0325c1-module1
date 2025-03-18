package ss6_method;

import java.util.Scanner;

public class DieuKien {

    public static void main(String[] args) {
        // Câu a: Chuyển ký tự chữ hoa thành chữ thường
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot ky tu: ");
        char character = scanner.next().charAt(0);

        System.out.println("Gia tri sau khi chuyen doi la: " + toLowerCase(character));

        // Câu b: Giải phương trình bậc nhất
        System.out.print("\nNhap vao he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao he so b: ");
        double b = scanner.nextDouble();

        System.out.println("Ket qua cua phuong trinh bac nhat:");
        levelOne(a, b);

        // Câu c: Giải phương trình bậc hai
        System.out.print("\nNhap vao he so a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap vao he so b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap vao he so c: ");
        double c = scanner.nextDouble();

        System.out.println("Ket qua cua phuong trinh:");
        levelTwo(a, b, c);

        // Câu d: Tìm giá trị nhỏ nhất của 4 số nguyên
        System.out.print("\nNhap vao so nguyen a: ");
        int aInt = scanner.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        int bInt = scanner.nextInt();
        System.out.print("Nhap vao so nguyen c: ");
        int cInt = scanner.nextInt();
        System.out.print("Nhap vao so nguyen d: ");
        int dInt = scanner.nextInt();
        int min = min(aInt, bInt, cInt, dInt);

        System.out.println("\nGia tri nho nhat cua 4 so la: " + min);
    }

    // Câu a: Chuyển ký tự hoa thành ký tự thường
    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    // Câu b: Giải phương trình bậc nhất
    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
    }

    // Câu c: Giải phương trình bậc hai
    public static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Phuong trinh tro thanh phuong trinh bac 1: " + b + "x + " + c + " = 0");
            if (b != 0) {
                double x = -c / b;
                System.out.println("Nghiem cua phuong trinh la: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co mot nghiem duy nhat: x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }

    // Câu d: Tìm giá trị nhỏ nhất của 4 số nguyên
    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}
