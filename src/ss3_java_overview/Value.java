package ss3_java_overview;

public class Value {
    public static void main(String[] args) {
        // a
        int i = 1, j = 1;
        int a = i+++ j++;
        System.out.println("a = " + a + ", i = " + i + ", j = " + j);  // a = 2, i = 2, j = 2

        // b
        i = 1;
        j = 1;
        a = i++ + ++j;
        System.out.println("a = " + a + ", i = " + i + ", j = " + j);  // a = 3, i = 2, j = 2

        // c
        i = 1;
        j = 1;
        a = ++i + j++;
        System.out.println("a = " + a + ", i = " + i + ", j = " + j);  // a = 3, i = 2, j = 2

        // d
        i = 1;
        j = 1;
        a = ++i + ++j;
        System.out.println("a = " + a + ", i = " + i + ", j = " + j);  // a = 4, i = 2, j = 2

        // e
        i = 1;
        j = 1;
        a = i+++ j+++ i+++ j++;
        System.out.println("a = " + a + ", i = " + i + ", j = " + j);  // a = 6, i = 3, j = 3

        // f
        i = 1;
        j = 1;
        a = ++i + ++j + i++ + j++;
        System.out.println("a = " + a + ", i = " + i + ", j = " + j);  // a = 8, i = 3, j = 3

        // g
        i = 1;
        a = i++ + ++i - i---i;
        System.out.println("a = " + a + ", i = " + i);  // a = -1, i = 1

        // h
        a = 10;
        a += a++ + ++a;
        System.out.println("a = " + a);  // a = 32
    }
}
