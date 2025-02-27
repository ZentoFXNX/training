class overloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    // void test(int a) {
    //     System.out.println("a: " + a);
    // }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

//     double test(double a) {
//         System.out.println();
//         return a*a;
//     }
// }

    void test(double a) {
        System.out.println("Внутри test(double) a: " + a);
    } 

    class overload {
        public static void main(String[] args) {
            overloadDemo ob = new overloadDemo();
            // double result;
            int i = 88;
            // вызввать все версии test().

            ob.test();
            // ob.test(10);
            ob.test(10, 20);
            ob.test(i);
            ob.test(123.2);
            // result = ob.test(123.25);
            // System.out.println("Результат вызова ob.test(123.25): " + result);
        }
    }
}