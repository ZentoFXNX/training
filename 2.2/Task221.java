public class Task221 {
    public static void main(String[] args) {
        int sum = 0;
        int form;
        for(int i = 0; i <= 100; i++) {
            sum += i;
        }
        form = sum / 101;
        System.out.println(form);
    }
}
