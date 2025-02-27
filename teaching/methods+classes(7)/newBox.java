public class newBox {
    double width;
    double height;
    double depth;

    newBox(newBox clone) {
            width = clone.width;
            height = clone.height;
            depth = clone.depth;
    }

    newBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    newBox() {
        width = -1;
        height = 1;
        depth = -1;
    }

    newBox(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        newBox mybox1 = new newBox(10, 20, 15);
        newBox mybox2 = new newBox();
        newBox mycube = new newBox(7);
        newBox myclone = new newBox(mybox1);
        newBox myclone1 = new newBox(mycube);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Объём mycube равен " + vol);

        vol = myclone.volume();
        System.out.println("Объём myclone равен " + vol);

        vol = myclone1.volume();
        System.out.println("Объём myclone1 равен " + vol);
    }
}
