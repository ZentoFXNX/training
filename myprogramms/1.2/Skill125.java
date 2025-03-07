import java.util.Scanner;

public class Skill125 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String textNumber1 = scanner1.nextLine();
        

        Scanner scanner2 = new Scanner(System.in);
        String textNumber2 = scanner2.nextLine();

        textNumber1 = String.valueOf(textNumber1.charAt(0));
        textNumber2 = String.valueOf(textNumber2.charAt(0));

        if(textNumber1.equals(textNumber2)) System.out.println("совпадают");
        else System.out.println("не совпадают");

        scanner1.close();
        scanner2.close();
    }
}
