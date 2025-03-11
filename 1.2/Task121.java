import java.util.Scanner;



public class Skill121 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        String teleport = Integer.toString(number);
        char first = teleport.charAt(0);
        System.out.println("1 цифра числа: " + first);

        scanner.close();
    }
}
