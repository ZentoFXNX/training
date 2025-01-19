import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] nums = { 6, 8, 3, 7, 5, 6, 1, 4 };
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputInt = scanner.nextInt();

        for (int x : nums) {
            if (x == inputInt) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Значение найдено!");
        else System.out.println("Число не найдено");
        scanner.close();
    }
}