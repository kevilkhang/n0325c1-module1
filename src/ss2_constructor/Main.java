package ss2_constructor;

public class Main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.xuat();
        PhanSo b = new PhanSo(1, 2);
        b.xuat();

        PhanSo f = b.copy();
        f.xuat();
    }
}
