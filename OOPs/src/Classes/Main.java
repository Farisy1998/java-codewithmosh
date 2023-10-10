public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        textBox1.text = "Box 1";
        System.out.println(textBox1.text);

        TextBox textBox2 = new TextBox();
        textBox2.text = "Box 2";
        System.out.println(textBox2.text);

        // Memory allocation
        TextBox textBox3 = new TextBox();
        TextBox textBox4 = textBox3;
        textBox4.text = "Hello World!";
        System.out.println(textBox3.text);
    }
}
