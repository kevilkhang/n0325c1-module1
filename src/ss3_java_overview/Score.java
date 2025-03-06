package ss3_java_overview;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap diem thi va he so mon Toan
        System.out.print("Nhap diem thi mon Toan: ");
        double diemToan = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap he so mon Toan: ");
        int heSoToan = Integer.parseInt(scanner.nextLine());

        // Nhap diem thi va he so mon Ly
        System.out.print("Nhap diem thi mon Ly: ");
        double diemLy = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap he so mon Ly: ");
        int hesoLy = Integer.parseInt(scanner.nextLine());

        // Nhap diem thi va he so mon Hoa
        System.out.print("Nhap diem thi mon Hoa: ");
        double diemHoa = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap he so mon Hoa: ");
        int hesoHoa = Integer.parseInt(scanner.nextLine());

        // Tinh diem trung binh
        double diemTrungBinh = (diemToan * heSoToan + diemLy * hesoLy + diemHoa * hesoHoa / (heSoToan + hesoLy + hesoHoa));

        System.out.println("Diem trung binh la: " + diemTrungBinh);
    }
}
