public class PrimitiveVSReference {
    public static void main(String[] args){
        // In primitive types
        // ------------------------
        int x = 1;
        int y = 1;
        x = 2;
        System.out.println(y);

        // But in reference types
        // ------------------------------
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2.x+", "+point2.y);
    }
}
