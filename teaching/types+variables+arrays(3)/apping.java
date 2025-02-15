public class apping {
    public static void main(String[] args) {
        byte a = 50;
        byte b = 110;
        byte c;
        int d = a * b;
        System.out.println(d);
        c = (byte) d;
        System.out.println(c);

        // byte l = 50;
        // l = l * 2; // ошибка так нельзя (автоматически byte, short, char АВТОМАТИЧЕСКИ переходят в int)
        byte g = 50;
        g = (byte) (g * 2);
        System.out.println(g);
    }
}
