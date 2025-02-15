public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2; // 01000000 сдвигаем на 1 = 10000000 сдвигаем на 1 = 0001000000 автоматически повышается до типа int при сдвиге (больше 8 бит)
        b = (byte) (a << 2); // b имеет тип byte не может в int перевести обратно, будет 0.
        System.out.println("Первоначальное значение: " + a);
        System.out.println("i и b: " + i + " " + b);
    }
}
