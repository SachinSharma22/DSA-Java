public class MethodOverloading {
    public static void main(String[] args) {
        Calculator12 calc = new Calculator12();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.2, (float)1.3));
        System.out.println(calc.sum(1, 2,3));
    }
}

class Calculator12{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
