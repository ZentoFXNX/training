public class logickorotko {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0 && number % 2 == 0) {
            System.out.println("Число положительное и четное.");
        } else {
            System.out.println("Число не удовлетворяет условиям.");
        }
    }
}
// если первый операнд И (&&) false второй операнд не будет проверяться всё равно будет false.
// если первый операнд ИЛИ (||) true второй операнд не будет проверятьтся всё равно будет true.