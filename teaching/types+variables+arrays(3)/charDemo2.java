public class charDemo2 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 теперь содержит " + ch1);
        ch1++;
        System.out.println("ch1 теперь содержит " + ch1);
    }
}
// короче можно с типом char если представлять символы в цифры их индекса в их кодировке, то можно с ними в целом работать арифметически.
// он может входить в целочисленный тип к: byte, short, int, long.