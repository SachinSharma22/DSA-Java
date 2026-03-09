public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}
class Animal5{
    void eat() {
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal5{
    void eat() {
        System.out.println("Eat Grass");
    }
}
