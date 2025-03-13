public class Task214 {
    public int fact(int item) {
        int result;

        if(item == 1) return 1;
        result = fact(item - 1) * item;
        return result;
    }
}

class Task214Main {
    public static void main(String[] args) {
        byte num = 12;
        Task214 mainNumber = new Task214();
        System.out.println(mainNumber.fact(num));
    }
}
