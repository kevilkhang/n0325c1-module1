package ss7_string;

import java.util.Scanner;

public class SoSanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chuoi a: ");
        String a = scanner.nextLine();

        System.out.print("Nhap vao chuoi b: ");
        String b = scanner.nextLine();

        int compare = a.compareTo(b);

        if (compare == 0) {
            System.out.println("a = b");
        } else if (compare < 0) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}
