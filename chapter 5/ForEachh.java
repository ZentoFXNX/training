public class ForEachh {
    public static void main(String[] args) {
        int[] mass = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int i : mass) {
            System.out.println("значение i: " + i);
            sum += i;
        }
        System.out.println(sum);
    }
}
