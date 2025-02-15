public class BlockTest {
    public static void main(String[] args) {
        int y = 20;
        // целью этого цикла является блок
        // итерация происходит после выполнения блока кода
        for (int x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
        int b = 13;
    }
}
