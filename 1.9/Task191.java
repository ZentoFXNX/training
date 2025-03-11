import java.util.Scanner;

public class Task191 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String text1 = scanner1.nextLine();
        
        Scanner scanner2 = new Scanner(System.in);
        String text2 = scanner2.nextLine();

        char textlast1 = text1.charAt(text1.length() - 1);
        char textlast2 = text2.charAt(0);

        if(textlast1 == textlast2) System.out.println("Сходятся");

        scanner1.close();
        scanner2.close();
    }
}
