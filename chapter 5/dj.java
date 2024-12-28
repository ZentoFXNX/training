public class dj {
    public static void main(String[] args) {
        int a = 10;
        int b = (a = 5) * a++;
        System.out.println(a + " " + b);
    }
}
