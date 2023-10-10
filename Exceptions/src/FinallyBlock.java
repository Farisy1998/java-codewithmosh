import java.io.FileReader;

public class FinallyBlock {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("file1.txt");
            var values = reader.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally { 
            // The finally block will be executed if a exeception 
            // is threw or not
            System.out.println("Inside finally block");
            if(reader != null){
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
