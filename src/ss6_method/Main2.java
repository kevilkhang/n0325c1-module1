package ss6_method;

public class Main2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        calTotal(a, b);
    }

    // Cach 1
    public static void calTotal(int a, int b) {
        int total = a + b;
        System.out.println("Total: " + total);
    }

    // Cach 2
    public static int calTotal2(int a, int b) {
        int total = a + b;
        return total;
    }

}
