import java.util.Scanner;

public class Skill116 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char letter = text.charAt(text.length() - 1);
        char b = 'ь';
        if (letter == b) System.out.println(text.charAt(text.length() - 2));
        else System.out.println(letter);

        scanner.close();
    }
}
