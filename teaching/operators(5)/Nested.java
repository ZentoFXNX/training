public class Nested {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = i; k < 10; k++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
