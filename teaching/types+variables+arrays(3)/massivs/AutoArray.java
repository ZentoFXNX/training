package massivs;

public class AutoArray {
    public static void main(String[] args) {
        int[][] numbers = new int[2][5];
        int k = 0;

        // Заполнение массива
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = k;
                k++;
            }
        }

        // Вывод массива как матрицы
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
