package ss7_string;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main2_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Buoc 1: Nhap vao so luong phan tu cua mang

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
        inputArr(arr);


        // Buoc 4: Xuat mang
        outputArr(arr);


        // Kiem tra mang toan chan
        if (isAllEven(arr)) {
            System.out.println("Mang toan chan");
        } else {
            System.out.println("Mang toan le");
        }
    }

    static boolean isAllEven(int[] arr) {
        boolean isAllEven = true; // Phuong phap co hieu
        for (int i =0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }
    static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
