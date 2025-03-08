package ss4_condition;

import java.util.Scanner;

/**
 * Nhap vao 1 ky tu la chu cai. Neu nhap sai thi bao thong bao da nhap sai. Neu dung thi di kiem tra neu no dang la chu cai thuong thi bien no thanh chu cai hoa, neu do la chu cai hoa thi bien no thanh chu cai thuong
 */
public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao mot ki tu
        System.out.print("Nhap mot ky tu chu: ");
        char character = scanner.next().charAt(0);

        // Kiem tra xem ky tu nhap vao co phai chu cai khong
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {

            // Doi chu hoa thanh chu thuong va nguoc lai
            if (character >= 'a' && character <= 'z') {
                // Doi chu thuong thanh chu hoa
                character -= 32;
            } else {
                // Doi chu hoa thanh chu thuong
                character += 32;
            }

            // In ra ket qua
            System.out.println("Ky tu sau khi da doi: " + character);
        } else {
            System.out.println("Vui long nhap mot ky tu chu cai!");
        }
    }
}
