public class DynInit {
    // демонстрация использования динамической инициализации.
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        // переменная c инициализируется динамически.
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Длина гипотинузы равна " + c);
    }
}
