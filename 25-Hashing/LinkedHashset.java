import java.util.*;
public class LinkedHashset {

    public static void main(String[] args) {
       LinkedHashSet<String> lhs = new LinkedHashSet<>();
       lhs.add("Ravan");
       lhs.add("Raan");
       lhs.add("van");
       lhs.add("Rhaman");

       System.out.println(lhs);
    }
}