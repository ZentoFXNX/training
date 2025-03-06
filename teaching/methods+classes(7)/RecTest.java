public class RecTest {
    int[] values;
    
    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest object = new RecTest(11);
        int i;

        for(i=0; i<11; i++) object.values[i] = i;

        object.printArray(11);

        // int[] mass = {1 , 10, 3};

        // System.out.println(mass[1]);
    }
}