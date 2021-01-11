package Task7;

public class TwoNumbers {
    public static void main(String[] args) {
        int a = 135;
        int b = 189;

        while (a > 0) {
            System.out.println("Чиcло A" + a % 10);
            a = a / 10;
        }
        while (b > 0) {
            System.out.println("Чиcло B" + b % 10);
            b = b / 10;
        }
    }
}

