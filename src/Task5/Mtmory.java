package Task5;

public class Mtmory {
    public static void main(String[] args) {
        //Вывести на экран соответствующий между символами и их численными обозначениями в памяти компьютера.
        int c = 555;
        char b = (char) c;


        if (c > 0 || c <= 65535) {
            System.out.println("Числу: " + c + " Символ: " + b);
        }
    }
}
