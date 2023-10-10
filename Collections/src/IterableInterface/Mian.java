package IterableInterface;

public class Mian {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for(var item : list)
            System.out.println(item);
    }
}
