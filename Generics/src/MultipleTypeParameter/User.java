package MultipleTypeParameter;

public class User {
    
    public static <K, V> void setKeyValuePair(K key, V value) {
        System.out.println("Key: "+ key +", Value: "+ value);
    }
}
