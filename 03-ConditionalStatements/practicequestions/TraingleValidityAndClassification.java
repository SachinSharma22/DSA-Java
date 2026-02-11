public class TraingleValidityAndClassification {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 6;

        if((a+b) > c && (b+c)>a && (a+c) > b){
            //Equilateral Traingle
            if(a==b && b==c){
                System.out.println("Equilateeral Traingle");
            }else if(a == b || b == c || a == c){
                // Isosceles traingle
                System.out.println("Isosceles Taingle");
            }else{
                // Scalene Traingle
                System.out.println("Scalene Traingle");
            }
        }else{
            System.out.println("Enter valid sides that formed a traingle.");
        }
    }
}
