public class Inheritence {
    public static void main(String[] args) {
        // Fish f = new Fish();
        // f.breath();

        // Multilevel Inheritance
        // Dogs pit = new Dogs();
        // pit.eat();
        // pit.legs = 4;
        // System.out.println(pit.legs);

        // Hierarchial Inheritance
        Birds b = new Birds();
        b.breath();
        b.fly();
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

class Mammel extends Animal{
    int legs;
    void walk(){
        System.out.println("Can walk");
    }
}

class Birds extends Animal{
    void fly() {
        System.out.println("Can fly");
    }
}


// class Dogs extends Mammel{
//     String breed;
// }

// // Derived Class

// class Fish extends Animal{
//     int fins;

//     void swims () {
//         System.out.println("Swims");
//     }
// }