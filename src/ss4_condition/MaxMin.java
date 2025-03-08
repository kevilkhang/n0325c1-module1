package ss4_condition;

import java.util.Scanner;

/**
 * Tim min va max cua 2 gia tri da cho
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao 2 so nguyen a, b
        System.out.print("Nhap vao so nguyen a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        int b = scanner.nextInt();

//        // Tim min, max
//        if (a > b) {
//            System.out.println("So lon nhat la: " + a);
//            System.out.println("So nho nhat la: " + b);
//        } else {
//            System.out.println("So lon nhan la: " + b);
//            System.out.println("So nho nhat la: " + a);
//        }
//
         // Cach 2
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);
    }
}