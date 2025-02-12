// package Box;

// class Box {
//     double width;
//     double height;
//     double depth;

//     // отобразить объём коробки
//     double volume() {
//         // System.out.print("Объём равен ");
//         // System.out.println(width * height * depth);

//         return width * height * depth;
//     }
// }

// class BoxDemo2 {
//     public static void main(String[] args) {
//         Box mybox1 = new Box();
//         Box mybox2 = new Box();
//         double vol;

//         mybox1.width = 10;
//         mybox1.height = 20;
//         mybox1.depth = 15;

//         mybox2.width = 5;
//         mybox2.height = 10;
//         mybox2.depth = 10;

//         // отобразить объём первой коробки

//         // mybox1.volume();
//         vol = mybox1.volume();

//         // если ссылаться на обычную переменную для print, то она должна иметь точно такой же тип как и сам метод.
//         // System.out.println("Объём равен " + vol);
//         System.out.println("Объём равен " + mybox1.volume());

//         // отобразить объём второй коробки

//         // mybox2.volume();
//         vol = mybox2.volume();
//         // System.out.println("Объём равен " + vol);
//         System.out.println("Объём равен " + mybox2.volume());
//     }
// }
