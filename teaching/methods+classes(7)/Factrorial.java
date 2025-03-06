public class Factrorial {
    int fact(int n) {
        int result;

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

// 4! = ((3! (2!(1!(1! = 1) * 2) * 3)) * 4)

class Recursion {
    public static void main(String[] args) {
        Factrorial f = new Factrorial();

        System.out.println("Factorial 1 = " + f.fact(1));
    }
}


