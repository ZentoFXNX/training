public class Conversion {
    public static void main(String[] args) {
        byte b; // Диапозон byte = 256 (-128 -> 127)
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование int в byte.");
        b = (byte) i; // 257 типа int делится на диапозон byte(256), чтобы преобразовать в byte = 257/256 = 1 (остаток от деления)
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\nПреобразование double в int.");
        i = (int) d;
        System.out.println("d и i: " + d + " " + i);

        System.out.println("\nПреобразование double в byte.");
        b = (byte) d;
        System.out.println("d и b: " + d + " " + b);
    }
}
