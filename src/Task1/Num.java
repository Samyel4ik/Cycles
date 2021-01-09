package Task1;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.print("Введите значение: ");
        number = num.nextInt();                 // значение которое вводит пользователь
        int i = 1;
        int sum = 0;

        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
