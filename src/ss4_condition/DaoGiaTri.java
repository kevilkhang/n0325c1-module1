package ss4_condition;

import java.util.Scanner;

/**
 * Nhap vao 2 so nguyen, luu vao 2 bien a va b. Sau do, dao gia tri cua 2 bien nay roi xuat gia tri cua chung ra man hinh console
 */
public class DaoGiaTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        int b = scanner.nextInt();

        // Gia tri ban dau cua a va b
        System.out.println("Gia tri ban dau:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Dao gia tri a va b bang temp
        int temp = a;
        a = b;
        b = temp;

        // Gia tri sau khi dao
        System.out.println("Gia tri sau khi dao:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
