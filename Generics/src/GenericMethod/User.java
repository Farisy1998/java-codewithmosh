package GenericMethod;

public class User implements Comparable<User> {
    private int points = 10;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other){
        // this.points < o.points => -1
        // this.points == o.points => 0
        // this.points > o.points => -1
        return points - other.points;
    }

    public String toString(){
        return "Points: " + points;
    }
}
