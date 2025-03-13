public class Task1104 {
    public static void main(String[] args) {
        float num = 12345;
        int i = 0;

        while (num >= 10) {
            num /= 2;
            i++;
            System.out.println("Шаг " + i + ": " + num);
        }

        System.out.println("Всего итераций: " + i);
    }
}