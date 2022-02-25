import java.io.*;

public class TextFileReader {
    public static void main(String[] args) {
        String fileNameAndPath = "c:/students.txt";
        File f = new File(fileNameAndPath);
        if (f.exists()) {
        System.out.println("Yes, " + fileNameAndPath + " exists");
        } else {
        System.out.println("No, " + fileNameAndPath + " does not exist");
        }
    }
}
