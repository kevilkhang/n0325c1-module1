package ss7_string;

public class Main {
    public static void main(String[] args) {
        String str1 = "Nguyen Ngoc Quang";
        String str2 = "Nguyen Ngoc Quang";
        String str3 = new String("Nguyen Ngoc Quang");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}