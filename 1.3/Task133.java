import java.util.Scanner;

public class Task133 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        int del = number1 % number2;

        System.out.println(del);

        scanner1.close();
        scanner2.close();
    }
}
