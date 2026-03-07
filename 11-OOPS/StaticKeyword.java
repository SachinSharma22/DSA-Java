public class StaticKeyword {
    public static void main(String[] args) {
        // Student2 s = new Student2();
        // s.schoolName = "IPS";
        /*Static variables can be changed with the first object that access the static variable or function. It can also apply on function.
        When you change that variable or try to access and modify their value, then the value of the static variable can be modified according to second modification. */
        Student2 s1 = new Student2();
        // System.out.println(s1.schoolName);
        s1.name = "sachinSharma";
        System.out.println(s1.getName());
    }
}

class Student2 {
    String name;
    int rollNo;

    static String schoolName;
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
