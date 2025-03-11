public class Task1103 {
    public static void main(String[] args) {
        int num = 12;
        int i;
        i = num;

        for(; i <= num; i--) {
            if(num % i == 0) System.out.println(i + " ");
        }
        System.out.println();
    }
}
