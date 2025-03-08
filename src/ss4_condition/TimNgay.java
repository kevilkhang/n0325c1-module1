package ss4_condition;

import java.util.Scanner;

/**
 * Nhap vao thong tin 1 ngay (ngay - thang - nam). Kiem tra ngay co hop le hay khong? Neu hop le hay tim ra ngay ke tiep (ngay - thang - nam) & ngay truoc do (ngay - thang - nam)
 */
public class TimNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int ngay = scanner.nextInt();

        if (ngay < 1 || ngay > 31) {
            System.out.println("Ngay khong hop le");
            return;
        }

        System.out.print("Nhap thang: ");
        int thang = scanner.nextInt();

        if (thang < 1 || thang > 12) {
            System.out.println("Thang khong hop le");
            return;
        }

        // Thang co 30 ngay
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            if (ngay == 31) {
                System.out.println("Ngay khong hop le");
                return;
            }
        }

        System.out.print("Nhap nam: ");
        int nam = scanner.nextInt();

        // Kiem tra nam nhuan (thang 2  co 29 ngay)
        // Nam nhuan (Chia het cho 4 nhung khong chia het cho 100, chia het cho 400)
        boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);

        if (thang == 2) {
            if (namNhuan) {
                if (ngay > 29) {
                    System.out.println("Ngay khong hop le");
                    return;
                }
            } else {
                if (ngay > 28) {
                    System.out.println("Ngay khong hop le");
                    return;
                }
            }
        }

        System.out.println("Ngay hop le");

        // Tim ngay ke tiep
        int ngayKeTiep = ngay;
        int thangKeTiep = thang;
        int namKeTiep = nam;

        ngayKeTiep++;

        // Qua thang moi
        if (ngayKeTiep > 31
                || (thang == 2 && ngayKeTiep > (namNhuan ? 29 : 28))
                || ((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngayKeTiep > 30)) {
            ngayKeTiep = 1;
            thangKeTiep++;
        }

        if (thangKeTiep > 12) {
            thangKeTiep = 1;
            namKeTiep++;
        }

        System.out.printf("Ngay ke tiep: %d/%d/%d", ngayKeTiep, thangKeTiep, namKeTiep);

        // Tim ngay truoc do
        int ngayTruocDo = ngay;
        int thangTruocDo = thang;
        int namTruocDo = nam;

        // Ngay truoc do
        ngayTruocDo--;
        if (ngayTruocDo < 1) { // Thang truoc do
            thangTruocDo--;
            if (thangTruocDo < 1) { // Nam truoc do
                thangTruocDo = 2;
                namTruocDo--;
            }

            // Cap nhat ngay (thang 30 ngay)
            if (thangTruocDo == 4 || thangTruocDo == 6 || thangTruocDo == 9 || thangTruocDo == 11) {
                ngayTruocDo = 30;
            } else if (thangTruocDo == 2) { // Cap nhat ngay cho truong hop thang 2
                if (namNhuan) {
                    ngayTruocDo = 29;
                } else {
                    ngayTruocDo = 28;
                }
            } else { // Cap nhat ngay cho truong hop thang 31 ngay
                ngayTruocDo = 31;
            }
            System.out.println();
            System.out.printf("Ngay truoc do: %d/%d/%d", ngayTruocDo, thangTruocDo, namTruocDo);
        }
    }
}