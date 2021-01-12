package Task4;

public class Multiply {
    public static void main(String[] args) {

        long m = 1; //произведение

        int a = 2; //степень

        for (int i = 1; i <= 200; i++) {
            m = (long) (m * Math.pow(i, 2));
        }
        System.out.println(m);
    }
}
