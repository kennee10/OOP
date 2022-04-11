import java.io.*;
import org.apache.commons.csv.*;


public class Q7{
    public static void main(String[] args){
        int gradeColumn = 3;
        int nameColumn = 0;
        long startTime = System.currentTimeMillis();
        try {
            Reader in = new FileReader("data/result.csv");
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                String name = record.get(nameColumn);

                if (Double.parseDouble(record.get(gradeColumn)) >= 3.7){
                  System.out.println(name);  
                }
                
            }

        }catch (FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
    }
}