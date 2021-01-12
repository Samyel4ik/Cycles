package Task3;

public class Summ {
    public static void main(String[] args) {
        double i = 1;
        double sum = 1;
        int a = 2; // степень
        for (i = 1; i <= 200; i++) {
            sum = sum * Math.pow(i, a);
        }
        System.out.println(sum);
    }
}
