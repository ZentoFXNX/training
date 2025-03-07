import java.util.Scanner;

// public class Skill114 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt();

        // if(number % 2 == 0) System.out.println(number + " чётное.");
        // else System.out.println(number + " нечётное.");

//         scanner.close();
//     }
// }

public class Skill114 {
    public void even(int number) {
        if(number % 2 == 0) System.out.println(number + " чётное.");
        else System.out.println(number + " нечётное.");
    }
}

class Skill114Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Skill114 mainNumber = new Skill114();

        mainNumber.even(number);
        scanner.close();
    }
}