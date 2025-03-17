package ss5_loop;

public class DieuKien {
    public static void main(String[] args) {
        System.out.println("Cac so thoa man dieu kien la:");

        for (int so = 10; so <= 99; so++) {
            int hangDonVi = so % 10; // Lay phan du
            int hangChuc = so / 10; // Lay phan nguyen

            int tong = hangDonVi + hangChuc;
            int tich = hangDonVi * hangChuc;

            if (tich == 2 * tong) {
                System.out.println(so);
            }
        }
    }
}
