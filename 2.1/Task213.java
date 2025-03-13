public class Task213 {
    public static void main(String[] args) {
        int num = 12345;
        String text = String.valueOf(num);
        int sum = 0;

        for(int i = 0; i < (text.length() - 1); i++) {
            int digit = Character.getNumericValue(text.charAt(i));
            if(digit % 2 == 0) {
                System.out.println(digit + " число с массива");
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}

// while(num == (text.length() - 1)) {
//     if(text.charAt(i) )
// }