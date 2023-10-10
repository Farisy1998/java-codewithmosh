public class Casting{
    public static void main(String[] args) {
        // Implicite casting (Indirect or Automatic casting)
        // --------------------------------------------------
        short x = 1;
        int y = x + 2; // implicitly casted the type of x from
                // short to int during the execution
        System.out.println(y);
        /* Note: When we adding a short with a int the short will
         converted to a int int type automaticaly during the execution.
         (means, the lower size value converted in to higher sized
         value to match the type) This is called implicte casting */
        // order: byte > short > int > long
        // Also there is chance of data loss in implicite 
        // casting

        // Explicite casting (direct casting)
        // ------------------------------------
        double a = 1.1;
        int b = (int) a + 2; // explicitly casted the type of 
                            // a from double to int during execution
        System.out.println(b);

        // With reference types
        // -------------------------
        String str = "1";
        int value = Integer.parseInt(str) + 2;
        System.out.println(value);
        // In every wrapper class there will be parse method
        // to parse a string to it's respective type.

        double dollar = Double.parseDouble(str) + 3.0;
        System.out.println(dollar);
    }
}