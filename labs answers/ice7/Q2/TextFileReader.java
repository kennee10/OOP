import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TextFileReader {
    public static void main(String[] args) {
        //using File exists method
        Path filePath = Paths.get("data", "students.txt");
        File file = new File(filePath.toString());

        long start = System.currentTimeMillis();
        if (file.exists()) {
            System.out.printf("Yes, %s exists\n", filePath.toString());
        } else {
            System.out.printf("No, %s does not exist\n", filePath.toString());
        }
        System.out.printf("It took %d ms\n", System.currentTimeMillis() - start);


        //using Exception
        start = System.currentTimeMillis();
        try {
            Scanner fileSc = new Scanner(file);
            System.out.printf("Yes, %s exists\n", filePath.toString());
        } catch (FileNotFoundException e) {
            System.out.printf("No, %s does not exist\n", filePath.toString());
        }
        System.out.printf("It took %d ms\n", System.currentTimeMillis() - start);
    }
}
