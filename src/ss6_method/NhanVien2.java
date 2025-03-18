package ss6_method;

import java.util.Scanner;

public class NhanVien2 {

    // Bước 1: Định nghĩa 25 biến toàn cục cho 5 nhân viên (mỗi nhân viên có 5 thông tin)
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTrungBinh = new double[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng nhân viên
        System.out.print("Nhap vao so luong nhan vien: ");
        int soNhanVien = Integer.parseInt(scanner.nextLine());

        // Bước 4: Cấu trúc switch-case để nhập và in thông tin từng nhân viên
        switch (soNhanVien) {
            case 1:
                nhapThongTin(1);
                xuatThongTin(1);
                break;
            case 2:
                nhapThongTin(1);
                nhapThongTin(2);
                xuatThongTin(1);
                xuatThongTin(2);
                break;
            case 3:
                nhapThongTin(1);
                nhapThongTin(2);
                nhapThongTin(3);
                xuatThongTin(1);
                xuatThongTin(2);
                xuatThongTin(3);
                break;
            case 4:
                nhapThongTin(1);
                nhapThongTin(2);
                nhapThongTin(3);
                nhapThongTin(4);
                xuatThongTin(1);
                xuatThongTin(2);
                xuatThongTin(3);
                xuatThongTin(4);
                break;
            case 5:
                nhapThongTin(1);
                nhapThongTin(2);
                nhapThongTin(3);
                nhapThongTin(4);
                nhapThongTin(5);
                xuatThongTin(1);
                xuatThongTin(2);
                xuatThongTin(3);
                xuatThongTin(4);
                xuatThongTin(5);
                break;
            default:
                System.out.println("Khong hop le! Chi co tu 1 den 5 nhan vien.");
        }
    }

    // Bước 2: 5 phương thức static để nhận thông tin cho từng nhân viên
    static void nhapThongTin(int nhanVien) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten nhan vien " + nhanVien + ": ");
        hoTen[nhanVien - 1] = scanner.nextLine();

        System.out.print("Nhap vao tuoi nhan vien " + nhanVien + ": ");
        tuoi[nhanVien - 1] = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vao gioi tinh nhan vien " + nhanVien + ": ");
        gioiTinh[nhanVien - 1] = scanner.nextLine();

        System.out.print("Nhap vao muc luong nhan vien " + nhanVien + ": ");
        mucLuong[nhanVien - 1] = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap vao diem trung binh nhan vien " + nhanVien + ": ");
        diemTrungBinh[nhanVien - 1] = Double.parseDouble(scanner.nextLine());
    }

    // Bước 3: 5 phương thức static để in thông tin cho từng nhân viên
    static void xuatThongTin(int nhanVien) {
        System.out.println("Thong tin nhan vien " + nhanVien + ":");
        System.out.println("Ten: " + hoTen[nhanVien - 1]);
        System.out.println("Tuoi: " + tuoi[nhanVien - 1]);
        System.out.println("Gioi tinh: " + gioiTinh[nhanVien - 1]);
        System.out.println("Muc luong: " + mucLuong[nhanVien - 1]);
        System.out.println("Diem trung binh: " + diemTrungBinh[nhanVien - 1]);
        System.out.println();
    }
}
