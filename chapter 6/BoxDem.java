public class BoxDem {
    double width;
    double height;
    double depth;

    BoxDem() {
        System.out.println("Контруирование Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        BoxDem mybox1 = new BoxDem();
        BoxDem mybox2 = new BoxDem();

        System.out.println("Объём равен 1-ой: " + mybox1.volume() + ", второй: " + mybox2.volume() + ".");
    }
}
