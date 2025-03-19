package ss7_string;

import java.util.Scanner;

public class XuLyChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Hello World";

        System.out.println("a. Lay ra chu World: " + str.substring(6));

        System.out.println("b. Thay o thanh f: " + str.replace('o', 'f'));

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("c. So ky tu l: " + count);

        System.out.println("d. Vi tri xuat hien dau tien: " + str.indexOf('l'));
        System.out.println("Vi tri xuat hien cuoi cung: " + str.lastIndexOf('l'));

        System.out.println("e. Xoa het space giua chung, dau tien va cuoi cung: " + str.replace(" ", ""));

        System.out.println("f. Xoa het space dau tien va cuoi cung: " + str.trim());

        String daoChuoi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            daoChuoi += str.charAt(i);
        }
        System.out.println("g. Chuoi dao: " + daoChuoi);


        System.out.println("h. SQC ".concat(str));

        System.out.println("i. Doi ki tu S sang chu hoa: " + str.toUpperCase());

        System.out.println("k. Doi toan bo ki tu cua S sang chu thuong: " + str.toLowerCase());

        System.out.print("Nhap vao ki tu n: ");
        int n = scanner.nextInt();
        System.out.print("Nhap vao ki tu m: ");
        int m = scanner.nextInt();
        System.out.printf("l. Chuoi con tu ki tu thu %d den thu %d: %s", n, m, str.substring(n, m));
    }
}
