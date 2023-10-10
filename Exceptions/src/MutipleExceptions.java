import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MutipleExceptions {
    public static void main(String[] args) {
        try {
            var reader = new FileReader("file.txt");
            var values = reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
