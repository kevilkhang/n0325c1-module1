package ss6_method;

import java.util.Scanner;

public class DoiKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot ky tu: ");
        char character = scanner.next().charAt(0);

        System.out.print("Gia tri sau khi chuyen doi la: " + toLowerCase(character));
    }

    public static char toLowerCase (char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }
}
