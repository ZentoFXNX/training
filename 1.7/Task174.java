public class Task174 {
    public static void main(String[] args) {
        int number = 12345;
        String text = String.valueOf(number);
        for(int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + "");
        }
        System.out.println();
    }
}
