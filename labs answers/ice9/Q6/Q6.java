import java.util.*;
import java.io.*;

public class Q6 {
    public static void main(String[] args){
        String filename = "result.csv";
        int gradeColumn = 3;
        int nameColumn = 0;

        long startTime = System.currentTimeMillis();
        try(Scanner sc = new Scanner(new File(filename))){
            sc.nextLine(); //ignores the header

            while (sc.hasNextLine()){
                String[] out = sc.nextLine().split(",");
                
                try {
                    if  (Double.parseDouble(out[gradeColumn]) >= 3.7){
                        System.out.println(out[nameColumn]);
                    }
                }catch (NumberFormatException e){
                    //not doing anything, skips the line that has input error
                    //System.out.println(Arrays.toString( out));
                }
            }
        }catch(Exception e){
            System.out.println("File not found");
        }
        
        long endTime = System.currentTimeMillis();   
        System.out.println("That took " + (endTime - startTime) + " milliseconds");    
    }
}