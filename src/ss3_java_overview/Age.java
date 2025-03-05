package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    private static int year;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao nam sinh cua ban: ");
        int year = Integer.parseInt((scanner.nextLine()));

        int age = Year.now().getValue() - year;

        System.out.println("Tuoi cua ban la: " + age);
    }
}
