package GenericMethod;

public class Utils {
    public static <T extends Comparable> T max(T first, T second){
        return (first.compareTo(second) > 0) ? first : second;
    }
}
