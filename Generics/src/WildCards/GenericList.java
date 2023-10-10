package WildCards;

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public String toString(){
        StringBuilder builder = new StringBuilder().append("[");
        for(int i = 0 ; i<items.length - 1 ; i++)
            builder.append(items[i]+", ");
        return builder.append(items[items.length - 1]+"]").toString();
    }
}
