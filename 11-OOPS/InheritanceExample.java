public class InheritanceExample {
    public static void main(String[] args) {
        Vehicle11 v = new Car();
        v.print();

        Vehicle11 v1 = new Vehicle11();
        v1.print();
    }
}

class Vehicle11{
    void print(){
        System.out.println("Base class vehicle");
    }
}
class Car extends Vehicle11{
    void print() {
        System.out.println("Derived class vehicle");
    }
}
