class Task181 {
    public void circle(int item) {
        for(; item > 0; item--) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

class task181Main {
    public static void main(String[] args) {
        Task181 teleport = new Task181();
        teleport.circle(100);
    }
}