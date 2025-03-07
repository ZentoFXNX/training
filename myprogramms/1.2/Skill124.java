import java.util.Scanner;

public class Skill124 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int all = text.length();

        System.out.println(all + " цифр в числе");

        scanner.close();
    }
}
