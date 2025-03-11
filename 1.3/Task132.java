import java.util.Scanner;

public class Task132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if(text.length() > 1) System.out.println(text.charAt(text.length() - 2));;

        scanner.close();
    }
}
