public class SuperKeyword {
    public static void main(String[] args) {
        Horse2 h2 = new Horse2();
        h2.printColor();
    }
}

class Animal2{
    String color = "Black";
    // Animal2() {
    //     System.out.println("Animal Constructor called...");
    // }
}

class Horse2 extends Animal2{
    // Horse2() {
    //     // super();
    //     System.out.println("Horse constructor called.....");
    // }

    String color = "Dark Black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
