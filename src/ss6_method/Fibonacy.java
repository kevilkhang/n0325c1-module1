package ss6_method;

import java.util.Scanner;

public class Fibonacy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen n tu ban phim: ");
        int n = scanner.nextInt();

        System.out.printf("%d phan tu cua day Fibonacci: ", n);
        printsNETlementsFibonnaci(n);
    }

    static void printsNETlementsFibonnaci (int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
