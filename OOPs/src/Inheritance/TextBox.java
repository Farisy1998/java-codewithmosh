package Inheritance;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox(){
        super(true);
        // System.out.println("TextBox");
    }

    // Method toString hasbeen overridden from the java.Object class
    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
