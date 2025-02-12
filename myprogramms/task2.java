import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String text;
        int length;
        System.out.print("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();

        length = text.length();
        System.out.println("Длинна строки: " + length);
    }
}


// public class task2 {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 100; i++) {
//             if (i <= 1) continue;
//             if (i % 2 == 0) System.out.println(i);
//         } 
//     }
// }