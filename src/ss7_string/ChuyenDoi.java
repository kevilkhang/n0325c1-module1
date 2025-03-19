package ss7_string;

public class ChuyenDoi {
    public static void main(String[] args) {
        // a. String > int
        String aStr = "100000000";
        int a = Integer.parseInt(aStr);

        // b. int > String
        String b = String.valueOf(a);

        // c. String > long
        String cStr = "123456789123456789";
        long c = Long.parseLong(cStr);

        // d. long > String
        String d = String.valueOf(c);

        // e. String > float
        String eSrt = "12.2F";
        float e = Float.parseFloat(eSrt);

        // f. float > String
        String f = String.valueOf(e);

        // g. String > double
        String gStr = "9.8D";
        double g = Double.parseDouble(gStr);

        // h. double > String;
        String h = String.valueOf(g);

        // i. String > short
        String iStr = "100";
        short i = Short.parseShort(iStr);

        // k. short > String
        String k = String.valueOf(i);
    }
}
