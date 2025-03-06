public class alg {

    public int task() {
        for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        return 0;
    }
}

class tochka {
    public static void main(String[] args) {
        alg start = new alg();
        start.task();
    }
}