public class LeapYear {
    public static void main(String[] args) {
        int year = 1990;
        if(year < 1582){
            System.out.println("Invalid (Gregorian calendar not applicable)");
        } else if(year %4 == 0 && year % 100 ==0 && year% 400 ==0){
            System.out.printf("%d is a leap year",year);
        }else{
            System.out.printf("%d is not a leap year", year);
        }
    }
}
