package Task6;

import java.util.Scanner;

public class Share {
    public static void main(String[] args) {
        Scanner Share = new Scanner(System.in);
        int m;
        System.out.print("Введите значение N: ");
        m = Share.nextInt();
        int n;
        System.out.print("Введите значение M: ");
        n = Share.nextInt();


        for (int t = m; t <= n; t++) {

            for (int del = 2; del < t; del++) {

                if (t % del == 0) {
                    System.out.println("Число-" + t + " " + "Его делители: " + del);
                }
            }
            System.out.println();
        }
    }
}

