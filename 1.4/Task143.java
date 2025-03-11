import java.util.Scanner;

public class Task143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num < 0 || num > 60) System.out.println("Число не входит в диапозон");
        else {
            String time = null;
            if(num >=0 && num <= 15) {
                time = "первую четверть";
            } else if(num >= 16 && num <= 30) {
                time = "вторую четверть";
            } else if(num >= 31 && num <= 45) {
                time = "третью четверть";
            } else if(num >= 46 && num <= 60) {
                time = "четвёртую четверть";
            }

            System.out.println("Минуты попадают в " + time + " часа");
        }
        scanner.close();
    }
}