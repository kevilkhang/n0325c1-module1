package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

/**
 * Nhap nam sinh cua mot nguoi. Tinh tuoi nguoi do
 */
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao nam sinh cua ban: ");
        int year = Integer.parseInt((scanner.nextLine()));

        // Tinh tuoi
        int age = Year.now().getValue() - year;

        // In ra ket qua
        System.out.println("Tuoi cua ban la: " + age);
    }
}
