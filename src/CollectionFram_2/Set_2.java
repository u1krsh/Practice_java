package CollectionFram_2;

import java.util.*;

public class Set_2 {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Saumya");
        name.add("Amaan");
        name.add("Zaid");
        name.add("Zaid");//duplicate ignored

        for(String namee: name){
            System.out.println(namee);
        }
    }
}
