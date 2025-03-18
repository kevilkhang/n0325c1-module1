package ss6_method;

import java.util.Scanner;

public class NhanVien3 {

    // Bước 1: Định nghĩa 25 biến toàn cục cho 5 nhân viên (mỗi nhân viên có 5 thông tin)
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTrungBinh = new double[5];
    static int soNhanVien = 0; // Biến này sẽ theo dõi số lượng nhân viên đã nhập

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho nhân viên và hỏi người dùng có muốn nhập tiếp không
        while (soNhanVien < 5) {
            nhapThongTin(soNhanVien + 1);  // Nhập thông tin cho nhân viên hiện tại
            soNhanVien++; // Tăng số lượng nhân viên đã nhập

            // Hỏi người dùng có muốn nhập tiếp không
            if (soNhanVien < 5) {
                System.out.print("Ban co muon nhap tiep (Yes/No)? ");
                String tiepTuc = scanner.nextLine().trim().toLowerCase();

                if (tiepTuc.equals("no")) {
                    break; // Dừng nhập nếu người dùng gõ "no"
                }
            }
        }

        // Sau khi nhập xong, in ra tất cả thông tin nhân viên đã nhập
        xuatTatCaThongTin();
    }

    // Bước 2: Phương thức để nhận thông tin cho từng nhân viên
    static void nhapThongTin(int nhanVien) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin cho nhan vien " + nhanVien + ":");

        System.out.print("Nhap vao ten: ");
        hoTen[nhanVien - 1] = scanner.nextLine();

        System.out.print("Nhap vao tuoi: ");
        tuoi[nhanVien - 1] = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vao gioi tinh: ");
        gioiTinh[nhanVien - 1] = scanner.nextLine();

        System.out.print("Nhap vao muc luong: ");
        mucLuong[nhanVien - 1] = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap vao diem trung binh: ");
        diemTrungBinh[nhanVien - 1] = Double.parseDouble(scanner.nextLine());
    }

    // Bước 3: Phương thức để in thông tin của tất cả các nhân viên đã nhập
    static void xuatTatCaThongTin() {
        System.out.println("\nDanh sach thong tin nhan vien:");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("\nThong tin nhan vien " + (i + 1) + ":");
            System.out.println("Ten: " + hoTen[i]);
            System.out.println("Tuoi: " + tuoi[i]);
            System.out.println("Gioi tinh: " + gioiTinh[i]);
            System.out.println("Muc luong: " + mucLuong[i]);
            System.out.println("Diem trung binh: " + diemTrungBinh[i]);
        }
    }
}
