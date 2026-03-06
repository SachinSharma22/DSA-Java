public class Inheritence {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.breath();
    }
}

// Base Class
class Animal{
    String color;
    
    void eat(){
        System.out.println("Can eat");
    }

    void breath() {
        System.out.println("Can breath");
    }
}

// Derived Class

class Fish extends Animal{
    int fins;

    void swims () {
        System.out.println("Swims");
    }
}