package ss5_loop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Vong lap ngoai: " +i);
            for (int j = 1; j <=3; j++) {
                System.out.println("Vong lap trong: " +j);
            }
        }
    }
}
