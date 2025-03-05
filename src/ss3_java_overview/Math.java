package ss3_java_overview;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        B1: Nhap vao hai so nguyen a va b tu ban phim
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

//        B2-5: Tinh tong, hieu, tich va thuong cua a va b
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b; // Chuyen doi a sang double de chia chinh xac

//        B6: In ra ket qua
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
    }
}
