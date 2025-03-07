import java.util.Scanner;

public class Skill115 {
    public static void main(String[] args) {
        System.out.print("Введите 1 слово: ");
        Scanner scanner1 = new Scanner(System.in);
        String letter1 = scanner1.nextLine();

        System.out.print("Введите 2 слово: ");
        Scanner scanner2 = new Scanner(System.in);
        String letter2 = scanner2.nextLine();


        char text1 = letter2.charAt(0);
        char text2 = letter1.charAt(0);
        if (text1 == text2) System.out.println(text1 + " равен " + text2); 
        else System.out.println("не равны");

        scanner1.close();
        scanner2.close();
    }
}
