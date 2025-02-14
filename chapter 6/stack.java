public class stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать верхушку стека.

    stack() {
        tos = -1;
    }
    // поместить элемент в стек

    void push(int item) {
        if (tos == 9) System.out.println("Стек полон");
        else stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошён.");
            return 0;
        }
        else return stck[tos--];
    }
}

class TestStack {
    public static void main(String[] args) {
        stack mystack1 = new stack();
        stack mystack2 = new stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 10; i++) System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2");
        for (int i = 0; i < 10; i++) System.out.println(mystack2.pop());
    }
}