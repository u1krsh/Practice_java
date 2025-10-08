package CollectionFram_2;

import java.util.*;

public class Map_2 {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Saumya");
        student.put(2,"Shaun");
        student.put(3,"Zaid");
//        System.out.println( student.values());
        for (Map.Entry<Integer,String> entry:student.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
