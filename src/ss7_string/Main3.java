package ss7_string;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30}; // Dia chi: 0xABCD1234, gia tri: 0xABCD1235

        changeData(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t"); // 10 99 30
        }
    }

    static void changeData(int[] arr) { // Dia chi: 0xABCD1237, gia tri: 0xABCD1235
        arr[1] = 99;
        arr = new int[]{9, 9, 9}; // Gia tri: 0xABCD1239
        arr[1] = 100;
    }
}