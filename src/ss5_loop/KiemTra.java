package ss5_loop;

import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen duong n: ");
        int n = scanner.nextInt();

        // Cau a
        // Chuyen thanh kieu chuoi String
        String str = Integer.toString(n);

        // B3: Su dung bien co de kiem tra
        boolean isPalindrome = true; // Gia su ban dau n la doi xung
        for (int i = 0; i <str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) { // Kiem tra truong hop phu dinh
                isPalindrome = false;
                break;
            }
        }

        // B4: Kiem tra gia tri cua bien co va xuat ket qua
        if (isPalindrome) {
            System.out.printf("%d la so doi xung", n);
        } else {
            System.out.printf("%d khong phai la so doi xung", n);
        }
    }
}
