package OverridingEqualsMethod;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true; // checking whether getting same object

        if(!(obj instanceof Point)) return false;   // whether the obj is instance of point class
        
        Point point = (Point) obj;
        return point.x == x && point.y == y; // checking whether the contents of the object are equal
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y); // to generate hashCode using the values
    }

}
