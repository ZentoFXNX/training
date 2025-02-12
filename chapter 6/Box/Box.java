package Box;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol1, vol2;

        mybox1.setDim(5, 10, 15);
        mybox2.setDim(10, 15, 20);

        vol1 = mybox1.volume();
        vol2 = mybox2.volume();

        System.out.println(vol1 + vol2);
    }
}
