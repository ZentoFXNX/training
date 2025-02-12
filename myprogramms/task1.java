import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0) System.out.println("Число " + number + " положительное.");
        else if (number < 0) System.out.println("Число " + number + " отрицательное.");
    }
}
