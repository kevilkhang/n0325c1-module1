package ss6_method;

import java.util.Scanner;

public class NhanVien1 {
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double mucLuong;
    static double diemTrungBinh;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }

    static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhap vao tuoi: ");
        tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vao gioi tinh: ");
        gioiTinh = scanner.nextLine();

        System.out.print("Nhap vao muc luong: ");
        mucLuong = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap vao diem trung binh: ");
        diemTrungBinh = Double.parseDouble(scanner.nextLine());
    }

   static void xuatThongTin() {
       System.out.println("Ten: " +hoTen);
       System.out.println("Tuoi: " +tuoi);
       System.out.println("Gioi tinh: " +gioiTinh);
       System.out.println("Muc luong: " +mucLuong);
       System.out.println("Diem trung binh: " +diemTrungBinh);
   }
}
