package Task4;

public class Multiply {
    public static void main(String[] args) {
        double i = 1;
        double m = 1; //произведение
        int a = 2; //степень

        for (i = 1; i <= 3; i++) {
            m = m * Math.pow(i, 2);
        }
        System.out.println(m);
    }
}
