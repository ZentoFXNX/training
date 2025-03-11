import java.util.Scanner;

// public class Skill112 {
//     public static void main(String[] args) {
        // System.out.print("Введите: ");
        // Scanner scanner = new Scanner(System.in);
        // String text = scanner.nextLine();
        
//         int number = text.length();
//         System.out.println("Количество символов: " + number);

//         scanner.close();
//     }
// }

public class Task112 {
    public void textline(String text) {
        int number = text.length();
        System.out.println(number + " количество символов");
    }
}

class Skill112Main {
    public static void main(String[] args) {
        System.out.print("Введите: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        Task112 alltext = new Task112();
        alltext.textline(text);

        scanner.close();
    }
}