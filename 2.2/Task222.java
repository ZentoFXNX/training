public class Task222 {
    public static void main(String[] args) {
        int num = 12345;
        String text = String.valueOf(num);
        
        char textfirst = text.charAt(text.length() - 1);
        char textlast = text.charAt(0);

        int firstNumber = Character.getNumericValue(textfirst);
        int lastNumber = Character.getNumericValue(textlast);

        System.out.println(firstNumber + lastNumber);
    }
}
