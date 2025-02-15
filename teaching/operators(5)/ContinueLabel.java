public class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}


// public class ContinueLabel {
//     public static void main(String[] args) {
//         boolean t = true;

//         System.out.println("Перед оператором return.");
//         if (t) return;
//         System.out.println();
//     }
// }

// public class ContinueLabel {
//     public static void main(String[] args) {
//         for (int i = 0; i < 3; i++) {
//             System.out.print("-> " + i + ": ");
//             for (int j = 0; j < 100; j++) {
//                 if (j == 10) break;
//                 System.out.println(j);
//             }
//             System.out.println();
//         }
//         System.out.println("Цикл завершён");
//     }
// }

// class ContinueLabel {
//     public static void main(String[] args) {
//         int sum = 0;
//         int[][] nums = new int[3][5];

//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 5; j++) {
//                 nums[i][j] = (i + 1) * (j + 1);
//             }
//             for (int[] x : nums) {
//                 for (int y : x) {
//                     System.out.println();
//                     sum += y;
//                 }
//             }
//         }
//         System.out.println("Сумма: " + sum);
//     }
// }