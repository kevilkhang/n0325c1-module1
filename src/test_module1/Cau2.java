package test_module1;

import java.util.Scanner;

/**
 * Nhap vao ban phim mang so nguyen gom n phan tu (n<=20). Hien thi ra man hinh hieu cua Tong cac so chan va Tong cac so le co trong mang.
 */
import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu n (n <= 20): ");
        int n = scanner.nextInt();

        if (n > 20) {
            System.out.println("So luong phan tu khong hop le!");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int tongSoChan = 0;
        int tongSoLe = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                tongSoChan += arr[i];
            } else {
                tongSoLe += arr[i];
            }
        }

        int hieuTong = tongSoChan - tongSoLe;

        System.out.println("Tong cac so chan trong mang: " + tongSoChan);
        System.out.println("Tong cac so le trong mang: " + tongSoLe);
        System.out.println("Hieu cua tong cac so chan va cac so le la: " + hieuTong);

    }
}
