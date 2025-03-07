import java.util.Scanner;

public class Skill123 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String teleport = Integer.toString(number);
        int first = Character.getNumericValue(teleport.charAt(0));
        int last = Character.getNumericValue(teleport.charAt(teleport.length() - 1));
        int sum = first + last;

        System.out.println("Сумма чисел " + sum);

        scanner.close();
    }
}
