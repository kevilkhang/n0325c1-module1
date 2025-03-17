package ss5_loop;

import java.util.Scanner;

public class TinhTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao gia tien cua mon do: ");
        int giaTien = scanner.nextInt();
        System.out.print("Nhap so tien khach hang tra: ");
        int khachTra = scanner.nextInt();

        int thoiLai = khachTra - giaTien;
        int menhGiaTien;

        for (int i = 2; i >= 0; i--) {
            int heSo = (int) Math.pow(10, i);

            menhGiaTien = 5000 * heSo;
            if (thoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", thoiLai / menhGiaTien, menhGiaTien);
                thoiLai %= menhGiaTien;
            }

            menhGiaTien = 2000 * heSo;
            if (thoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", thoiLai / menhGiaTien, menhGiaTien);
                thoiLai %= menhGiaTien;
            }

            menhGiaTien = 1000 * heSo;
            if (thoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", thoiLai / menhGiaTien, menhGiaTien);
                thoiLai %= menhGiaTien;
            }
        }

        System.out.println("So tien con lai: " + thoiLai);
    }
}
