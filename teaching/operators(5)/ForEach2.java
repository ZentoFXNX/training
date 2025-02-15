public class ForEach2 {
    public static void main(String[] args) {
        int[] mass = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int x : mass) {
            System.out.println("значение: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println(sum);
    }
}
