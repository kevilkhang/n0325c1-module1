package ss1_oop;

import java.util.Scanner;

public class Student {
        String name;
        double mathScore;
        double literatureScore;

        void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap vao ten hoc sinh: ");
            name = scanner.nextLine();

            System.out.print("Nhap vao diem toan: ");
            mathScore = scanner.nextDouble();

            System.out.print("Nhap vao diem van: ");
            literatureScore = scanner.nextDouble();
        }

        double calculateAverageScore() {
            return (mathScore + literatureScore) / 2;
        }

        void output() {
            System.out.println("Ten cua hoc sinh la: " + name);
            System.out.println("Diem toan la: " + mathScore);
            System.out.println("Diem van la: " + literatureScore);
            System.out.println("Diem trung binh cua 2 mon la: " + calculateAverageScore());
        }
    }
