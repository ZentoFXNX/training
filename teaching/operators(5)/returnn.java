public class returnn {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Выход из цикла, когда i равно 5
            }
            System.out.println(i);
        }

        System.out.println("After break");

        int result = sum(3, 4);
        System.out.println("Sum result: " + result);
    }

    public static int sum(int a, int b) {
        return a + b; // Возвращает сумму a и b
    }
}
