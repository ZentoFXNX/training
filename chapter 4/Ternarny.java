public class Ternarny {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Абсолтная величина ");
        System.out.println(i + " равна " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Абсолтная величина ");
        System.out.println(i + " равна " + k);
    }
}
