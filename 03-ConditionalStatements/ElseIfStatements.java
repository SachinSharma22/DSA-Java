public class ElseIfStatements {
    public static void main(String[] args) {
        int age = 15;
        if(age >= 18){
            System.out.println("You are adulth.");
        }else if (age > 13 && age < 18){
            System.out.println("Your are a teenager.");
        }else{
            System.out.println("Your are minor.");
        }
    }
}
