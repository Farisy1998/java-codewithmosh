package FinalKeyword;

// final class cannot be extended by any other classes
// The java String class is a final class
public final class A {
    // final feilds cannot be re-assigned (constants)
    final int x = 1;
    final int y = 2;
    
    // final method cannot be overriden
    public final void display(){
        System.out.println("In display");
    }
}
