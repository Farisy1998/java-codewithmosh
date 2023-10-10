package TryWithResourceStatement;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        // Inorder to use the try with resourse statement the 
        // class must be implement the AutoCloseable Interface
        try (
            // this code will create a finally block defaultlly and 
            // close the object context by executing the close()
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("file.txt");
        ) {
           var values = reader.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
