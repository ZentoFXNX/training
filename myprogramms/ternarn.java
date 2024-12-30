// public class ternarn {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 100; i++) {
//             if (i <= 1) continue;
//             if (i % 2 == 0) System.out.println(i);
//         } 
//     }
// }

// public class ternarn {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 100; i++) {
//             if (i <= 1) continue;
//             if (!(i % 2 == 0)) System.out.println(i);
//         } 
//     }
// }

// public class ternarn {
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 0; i <= 100; i++) {
//             if (i <= 0) continue;
//             if (i % 2 == 0) {
//                 sum += i;
//                 System.out.println(i);
//             }
//         }
//         System.out.println("Сумма чисел: " + sum);
//     }
// }

// public class ternarn {
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 0; i <= 100; i++) {
//             if (i <= 0) continue;
//             if (i % 3 == 0) {
//                 sum += i;
//                 System.out.println(i);
//             }
//         }
//         System.out.println("Сумма чисел: " + sum);
//     }
// }
// import java.util.Scanner;

// class ternarn {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int inputInt = scanner.nextInt();
//         int i = 0;
//         int sum2 = 0;
//         int sum3 = 0;
//         if (inputInt % 2 == 0) {
//             for (i = 0; i <= 100; i++) {
//                 if (inputInt <= 0) continue;
//                 if (inputInt % 2 == 0) {
//                     sum2 += i;
//                     System.out.println(i);
//                 }
//             }
//         } else {
//             for (int k = 0; k <= 100; k++) {
//                 if (inputInt <= 0) continue;
//                 if (inputInt % 3 == 0) {
//                     sum3 += k;
//                     System.out.println(k);
//                 }
//             }
//         }
//         System.out.println("Суммы двух чисел: ");
//     }
// }

import java.util.Scanner;

class Ternarn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int inputInt = scanner.nextInt();
        int sum2 = 0;
        int sum3 = 0;

        if (inputInt % 2 == 0) {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum2 += i;
                    System.out.println(i);
                }
            }
            System.out.println("Сумма четных чисел от 0 до 100: " + sum2);
        } else {
            for (int k = 0; k <= 100; k++) {
                if (k % 3 == 0) {
                    sum3 += k;
                    System.out.println(k);
                }
            }
            System.out.println("Сумма чисел, кратных 3, от 0 до 100: " + sum3);
        }

        scanner.close();
    }
}
