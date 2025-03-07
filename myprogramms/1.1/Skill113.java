import java.util.Scanner;

// public class Skill113 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String text = scanner.nextLine();

//         int number = text.length();
        // char last = text.charAt(number - 1);

//         System.out.println("Последнее число: " + last);

//         scanner.close();
//     }
// }

public class Skill113 {
    public void textline(String text) {
        int number = text.length();
        char last = text.charAt(number - 1);

        System.out.println(last + " последнее число");
    }
}

class Skill112Main {
    public static void main(String[] args) {
        System.out.print("Введите: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        Skill113 alltext = new Skill113();
        alltext.textline(text);

        scanner.close();
    }
}