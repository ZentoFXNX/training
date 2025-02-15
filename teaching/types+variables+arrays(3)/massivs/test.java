public class test {
    public static void main(String[] args) {
        double[] number = { 1.1, 2.2, 3.3, 4.4, 5.5};
        double result = 0;
        for(int i = 0; i < 5; i++) {
            result += number[i];
        }
        System.out.println("Ср значение: " + result / 5);
        int g;
        g = (int) result;
        System.out.println("Ср целое значение: " + g / 5);
    }
}
