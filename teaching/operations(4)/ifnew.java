import java.util.Scanner;

public class ifnew {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение:");

        // Считываем ввод как строку
        String input = scan.next();

        try {
            // Пытаемся преобразовать строку в число
            double number = Double.parseDouble(input);

            // Проверяем, является ли число целым
            if (number == (int) number) {
                int numb = (int) number;
                if (numb < 0) {
                    System.out.println("Число: " + numb + " отрицательное.");
                } else {
                    System.out.println("Число: " + numb + " положительное.");
                }
            } else {
                if (number < 0) {
                    System.out.println("Число: " + number + " отрицательное.");
                } else {
                    System.out.println("Число: " + number + " положительное.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Это не число.");
        }
    }
}
