package ss6_method;

import java.util.Scanner;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap vao so nguyen c: ");
        int c = scanner.nextInt();
        System.out.print("Nhap vao so nguyen d: ");
        int d = scanner.nextInt();
        int min = min(a, b, c, d);

        System.out.println("Gia tri nho nhat cua 4 so la: " + min);
    }

    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min (min, c);
        min = Math.min (min, d);
        return min;
    }
}
