public class foreach1 {
    public static void main(String[] args) {
        int[] mass = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i : mass) sum += i;
        System.out.println(sum);
    }
}