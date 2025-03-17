package ss7_string;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Buoc 1: Nhap vao so luong phan tu cua mang
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("So luong phan tu cua mang phai >= 0. Vui long kiem tra lai!");
            }
        } while (n < 0);


        // Buoc 2: Tao ra mang co n phan tu

        int[] arr = new int[n];

        // Buoc 3: Nhap mang

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }

        // Buoc 4: Xuat mang
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}