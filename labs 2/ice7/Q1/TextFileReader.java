import java.io.File;

public class TextFileReader {
    public static void main(String[] args) {
        String fileNameAndPath = "c:/Users/Cheong Kenn Ee/OneDrive - Singapore Management University/4 SMU Stuff/Y3S2/OOP/labs 2/ice7/Q1/students.txt";
        File f = new File(fileNameAndPath);
        if (f.exists()) {
        System.out.println("Yes, " + fileNameAndPath + " exists");
        } else {
        System.out.println("No, " + fileNameAndPath + " does not exist");
        }
    }
}
