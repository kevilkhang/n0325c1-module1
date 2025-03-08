package ss4_condition;

import java.util.Scanner;

/**
 * Nhap vao thang & nam. Hay cho biet thang do trong nam do co bao nhieu ngay.
 */
public class SoNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao thang (1-12): ");
        int thang = scanner.nextInt();
        System.out.print("Nhap vao nam: ");
        int nam = scanner.nextInt();

        // Tinh ngay trong thang
        int ngayTrongThang;

        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                ngayTrongThang = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                ngayTrongThang = 29; // Nam nhuan
                } else {
                ngayTrongThang = 28; // Nam khong nhuan
                }
                break;
            default:
                ngayTrongThang = 31;
                break;
        }
        System.out.printf("Thang %d trong nam %d co %d ngay ", thang, nam, ngayTrongThang);
    }
}
