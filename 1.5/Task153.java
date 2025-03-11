import java.util.Scanner;

public class Task153 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String text1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        String text2 = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        String text3 = scanner3.nextLine();

        char symbol1 = text1.charAt(0);
        char symbol2 = text2.charAt(0);
        char symbol3 = text3.charAt(0);

        String word = "" + symbol1 + symbol2 + symbol3;

        System.out.println(word);

        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
