import java.util.Scanner;

public class Task175 {
    public int sumDigits(int number) {
        if (number == 0) return 0; // База рекурсии
        return number % 10 + sumDigits(number / 10); // Берем последнюю цифру и рекурсивно вызываем метод
    }
}

class Skill175Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // Ввод числа
        scanner.close();

        Task175 skill = new Task175();
        System.out.println("Сумма цифр: " + skill.sumDigits(number)); // Math.abs() для работы с отрицательными числами
    }
}