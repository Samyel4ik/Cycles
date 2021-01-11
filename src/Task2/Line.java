package Task2;

public class Line {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int h = 2;
        int function;
        for (int line = a; line < b; line = line + h) { // изменненный отрезок с шагом h
            if (line > 2) {
                function = line;
                System.out.println("При длинне отрезка:" + line + " Значение функции: " + function);
            } else if (line <= 2) {
                function = -line;
                System.out.println("При длинне отрезка:" + line + " Значение функции: " + function);
            }
        }
    }
}
