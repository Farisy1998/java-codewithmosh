package WildCards;

public class Utils {
    public static <T extends Comparable> T max(T first, T second){
        return (first.compareTo(second) > 0) ? first : second;
    }

    public void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? extends User> users) {
        System.out.println(users);
    }
}
