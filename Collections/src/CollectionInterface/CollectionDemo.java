package CollectionInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);

        Collections.addAll(collection, "e", "f", "g");
        System.out.println(collection);

        collection.remove("a");

        // collection.clear();

        var contains = collection.contains("b");
        System.out.println(contains);

        // converting to object array
        var objectArray = collection.toArray();
        System.out.println(objectArray);

        // converting to string array
        var stringArray = collection.toArray(new String[0]);
        System.out.println(stringArray);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(other);
        
        System.out.println(collection.equals(other));
    }
}
