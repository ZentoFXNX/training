public class testReturn {
    int a;

    testReturn(int i) {
        a = i;
    }
    
    testReturn incrByTen() {
        testReturn temp = new testReturn(a+10);
        return temp;
    }
}

class RetObject {
    public static void main(String[] args) {
        testReturn object1 = new testReturn(2);
        testReturn object2;

        object2 = object1.incrByTen();
        System.out.println("object1.a: "+ object1.a);
        System.out.println("object2.a: " + object2.a);

        object2 = object2.incrByTen();
        System.out.println("object2.a после второго увеличения: " + object2.a);
    }
}
