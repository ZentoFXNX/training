import java.util.Scanner;

public class Skill122 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String teleport = Integer.toString(number);
        char last = teleport.charAt(teleport.length() - 1);

        System.out.println("Последнее число: " + last);

        scanner.close();
    }    
}
