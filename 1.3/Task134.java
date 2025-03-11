import java.util.Scanner;

public class Task134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима"; 
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "несуществующий месяц";
        }
        System.out.println(month + " - " + season);

        scanner.close();
    }
}