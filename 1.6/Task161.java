public class Task161 {
    public int sum(int item) {
        int result;

        if(item == 1) return 1;
        result = sum(item - 1) + item;
        return result;
    }
}

class Skill161Main {
    public static void main(String[] args) {
        Task161 fact = new Task161();
        System.out.println(fact.sum(100));
    }
}