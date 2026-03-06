public class AbstractClasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println("----------Chicken-----------------");
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal1{
    void eat() {
        System.out.println("Animals eat");
    }
    abstract void walk();
}

class Horse extends Animal1{
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal1{
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
