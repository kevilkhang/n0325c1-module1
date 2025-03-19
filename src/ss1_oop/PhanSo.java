package ss1_oop;

import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;

    // PT nhap
    void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tu so: ");
        tuSo = scanner.nextInt();

        do {
            System.out.print("Nhap mau so (khac 0): ");
            mauSo = scanner.nextInt();
        } while (mauSo == 0);
    }

    // PT tim ucln
    int timUocLonNhat(int tuSoBien, int mauSoBien) {
        if (tuSoBien == 1 && mauSoBien == 1) {
            return 1;
        }
        tuSoBien = Math.abs(mauSoBien);
        for (int i = tuSoBien; i >= 1; i--) {
            if (tuSoBien % i == 0 && mauSoBien % i == 0) {
                return 1;
            }
        }
        return 0;
    }

    // PT rut gon
    void rutGon() {
        int ucln = timUocLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    void tinhTong(PhanSo phanSoKhac) {
        int tuSoKhac = phanSoKhac.tuSo;
        int mauSoKhac = phanSoKhac.mauSo;
    }
}




