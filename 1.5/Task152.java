import java.util.Scanner;

public class Task152 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        if(number1 % number2 == 0) System.out.println("без остатка");
        else System.out.println("остаток есть");

        scanner1.close();
        scanner2.close();
    }
}
