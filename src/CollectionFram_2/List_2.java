package CollectionFram_2;
import java.util.*;
public class List_2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("grapes");
        fruits.add("Banana");//duplicate
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.println(fruits.get(1));
        fruits.remove("Banana");
        System.out.println(fruits);//removes from front
    }
}
