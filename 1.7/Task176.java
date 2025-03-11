import java.util.Scanner;

public class Task176 {
    public float mainNumber;

    Task176() {
        mainNumber = 1024;
    }

    public float mb(float number) {
        return number * mainNumber;
    }
    
    public float kb(float number) {
        return mb(number) * mainNumber;
    }

    public float bt(float number) {
        return kb(number) * mainNumber;
    }
}

class Skill176Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().replace(',', '.');
        float numb = Float.parseFloat(input);
        Task176 teleport = new Task176();
        scanner.close();
        System.out.println(teleport.kb(numb));
    }
}
