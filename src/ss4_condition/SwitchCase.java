package ss4_condition;

import java.util.Scanner;

/**
 * Nhap vao 1 so tu nhien tu 1 den 10, sau do in ra tieng Anh cua tu do theo 2 cach
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao 1 so tu nhien tu 1 den 10
        System.out.print("Nhap vao 1 so tu nhien tu 1 den 10: ");
        int number = scanner.nextInt();

        // Cach 1:
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else if (number == 10) {
            System.out.println("Ten");
        } else {
            System.out.println("Vui long nhap so tu nhien tu 1 den 10");
        }

//        // Cach 2:
        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("Vui long nhap so tu nhien tu 1 den 10");
        }
    }
}
