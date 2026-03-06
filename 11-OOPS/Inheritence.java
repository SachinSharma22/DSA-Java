public class Inheritence {
    public static void main(String[] args) {
        // Fish f = new Fish();
        // f.breath();

        // Multilevel Inheritance
        Dogs pit = new Dogs();
        pit.eat();
        pit.legs = 4;
        System.out.println(pit.legs);
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
}

class Dogs extends Mammel{
    String breed;
}

// // Derived Class

// class Fish extends Animal{
//     int fins;

//     void swims () {
//         System.out.println("Swims");
//     }
// }