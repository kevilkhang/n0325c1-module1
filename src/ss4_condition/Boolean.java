package ss4_condition;

/**
 * Tinh gia tri cua bien c va bien d
 */
public class Boolean {
    public static void main(String[] args) {

        boolean a = true && false; // && true vs false -> false
        boolean b = (3 > 100) || (25 % 5 == 0); // || false vs true -> true
        boolean c = a && b; // && false (a) vs true (b) -> false
        boolean d = !a || b; // || true (!a) vs true (b) -> true

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
