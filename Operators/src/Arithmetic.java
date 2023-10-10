public class Arithmetic {
    public static void main(String[] args){
        //  Arithmetic expressions using arithmetic operators
        // ----------------------------------------------------------
        // An expression is a statements which produces a
        // value.
        int a = 10 + 2;
        int b = 10 - 2;
        int c = 10 * 2;
        int d = 10 / 2;
        int m = 10 % 2;
        System.out.println(a+", "+b+", "+c+", "+d+", "+m);

        // Increment operator
        // --------------------------
        int x = 1;
        int y = x++; // post-fix
        System.out.println(x+", "+y);
        y = ++x; // pre-fix
        System.out.println(x+", "+y);

        // Augmented or compound assignment
        // -----------------------------------------
        int z  = 1;
        z+=1; // similar to z = z + 1;
        System.out.println(z);

        // Operator precidence
        // -------------------------
        // 1: ()
        // 2: *, /
        // 3: +, -
    }
}
