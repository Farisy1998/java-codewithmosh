package Inheritance;

public class Main {
    public static void main(String[] args) {
        // var textBox = new TextBox();
        // textBox.disable();
        // textBox.setText("Hello World!");
        // System.out.println(textBox.getState());
        // System.out.println(textBox.toString());

        var textBox = new TextBox();
        var control = new UIControl(true);
        show(textBox);
    }

    public static void show(UIControl control){
        if(control instanceof TextBox){
            var textBox = (TextBox)control; // down casting
            System.out.println(textBox);
        }
        else
            System.out.println(control);
    }
}
