package Task5;

public class Mtmory {
    public static void main(String[] args) {
        //Вывести на экран соответствующий между символами и их численными обозначениями в памяти компьютера.

        char b = 'a';
        int c = b ;


        if (c > 0 || c <= 65535) {
            System.out.println("Числу: " + c + " Символ: " + b);
        }
    }
}
