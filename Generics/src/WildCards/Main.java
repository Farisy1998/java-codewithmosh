package WildCards;

public class Main {
    public static void main(String[] args) {
        var user = new Instructor(10);
        var users = new GenericList<User>();
        users.add(new User(10));
        users.add(new User(20));
        Utils.printUsers(users);
    }
}
