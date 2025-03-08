package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // System.in: Tieu chuan de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao tuoi cua ban: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vao ten cua ban: ");
//        scanner.nextLine(); // Xoa het toan bo du lieu o trong bo nho dem (Enter)
        String name = scanner.nextLine();

        System.out.println("Ten cua ban la: " + name);
        System.out.println("Tuoi cua ban la: " + age);
    }
}
