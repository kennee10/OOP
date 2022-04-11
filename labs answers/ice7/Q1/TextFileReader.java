import java.nio.file.Path;   //NIO is an alternative IO API (package)
import java.nio.file.Paths;
import java.io.File;

public class TextFileReader {
    public static void main(String[] args) {
        //File file = new File("C:/students.txt");
        Path filePath = Paths.get("data", "students.txt");
        File file = new File(filePath.toString());        
        
        if (file.exists()) {
            System.out.printf("Yes, %s exists\n", filePath.toString());
        } else {
            System.out.printf("No, %s does not exist\n", filePath.toString());
        }
    }
}
