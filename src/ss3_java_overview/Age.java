package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao nam sinh cua ban: ");
        int year = scanner.nextInt();

        int age = Year.now().getValue() - year;

        System.out.println("Tuoi cua ban la: " + age);


    }
}
