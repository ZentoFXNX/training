class Test1 {
    int a, b;

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
        // System.out.println(i + " " + j);
    }

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test1 item) {
        item.a *= 2;
        item.b /= 2; 
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test1 object = new Test1(15, 20);

        System.out.println("item.a , item.b перед вызовом: " + object.a + " " + object.b);

        object.meth(object);

        // object.meth(10, 14);


        System.out.println("a и b перед вызовом: " + object.a + " " + object.b);
    }
}