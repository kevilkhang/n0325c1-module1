package ss2_constructor;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    // Mac dinh
    public ThoiGian() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    // 1 tham so
    public ThoiGian(int gio) {
        gio = gio;
        phut = 0;
        giay = 0;
    }


    // 2 tham so
    public ThoiGian(int gio, int phut) {
        gio = gio;
        phut = phut;
        giay = 0;
    }

    // 3 tham so
    public ThoiGian(int gio, int phut, int giay) {
        gio = gio;
        phut = phut;
        giay = giay;
    }

    public ThoiGian(ThoiGian thoiGian) {
        gio = thoiGian.gio;
        phut = thoiGian.phut;
        giay = thoiGian.giay;
    }

    public void xuat() {
        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }
}
