package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        Collections.addAll(list, "d", "e", "f");
        System.out.println(list);

        list.add(0, "g");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.subList(0, 3));
    }
}
