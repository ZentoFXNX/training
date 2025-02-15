public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFFE; // -2 в 10 СИ 
        for (i = 0; i < 4; i++) {
            num = num << 1; 
            System.out.println(num);
        }
    }
}

// умножения на 2 сдивгом.
