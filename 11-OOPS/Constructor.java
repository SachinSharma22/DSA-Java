public class Constructor {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("SachinSharma");
        Student s2 = new Student(234);

    }
}

class Student{
    String name;
    int rollNo;
    Student(){
        System.out.println("Constructor is called....");
    }
    Student(String name){
        this.name = name;
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
}
