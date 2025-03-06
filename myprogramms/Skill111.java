import java.util.Scanner;

public class Skill111 {
    public void notnumber(int number) {
            if(number < 0) System.out.println(number + " - отрицательное значение");
            else if(number >= 0) System.out.println(number + " - положительное число");
    }
}

class MainSkill {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Skill111 mainNumber = new Skill111(); 
        mainNumber.notnumber(number);

        scanner.close();
    }
}