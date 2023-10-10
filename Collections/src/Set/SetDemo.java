package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Sets willnot allows duplicate values, means all values inside
// the set will be unique. Also it will be un-orderd

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union
        set1.addAll(set2);
        System.out.println(set1);

        // Intersection
        set1.retainAll(set2);
        System.out.println(set1);

        // Difference
        set2.removeAll(set1);
        System.out.println(set1);

        // Replace duplicate elements in a Listz
        // one way is through
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "It", "is", "a", "blue", "color", "blue");
        System.out.println(list2);

        // convert it to the set
        Set<String> set3 = new HashSet<>(list2);
        System.out.println(set3);
    }
}
