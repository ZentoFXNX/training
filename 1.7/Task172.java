public class Task172 {
    public void pow(int item) {
        int result = 1;
        // return item * item;
        for(int i = 0; i < 10; i++) {
            System.out.println(result);
            result *= 2;
        }
    }
}

class Skill172Main {
    public static void main(String[] args) {
        Task172 base = new Task172();
        base.pow(2);
    }
}