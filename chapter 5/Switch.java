// public class Switch {
//     public static void main(String[] args) {
//         int month = 4; // апрель
//         String season;
//         switch (month) {
//             case 12:
//             case 1:
//             case 2:
//                 season = "зима"; 
//                 break;
//             case 3:
//             case 4:
//             case 5:
//                 season = "весна";
//                 break;
//             case 6:
//             case 7:
//             case 8:
//                 season = "лето";
//                 break;
//             case 9:
//             case 10:
//             case 11:
//                 season = "осень";
//                 break;
//             default:
//                 season = "несуществующий месяц";
//         }
//         System.out.println("Апрель - это " + season + ".");
//     }
// }

public class Switch {
    public static void main(String[] args) {
        String str = "two";

        switch (str) {
            case "one":
                System.out.println("один");
                break;
            case "two":
                System.out.println("два");
                break;
            case "three":
                System.out.println("три");
                break;
            default:
            System.out.println("Совпадений нет.");
                break;
        }
    }
}