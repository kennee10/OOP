// import the java.util package

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class DVDDAO {
    // declares the dvdList variable
    private ArrayList<DVD> dvdList = new ArrayList<DVD>();
    File dvdFile;


    // default constructor
    public DVDDAO() {
        dvdFile = new File("data/dvd.csv");
        load();
        // creates the ArrayList object to contain DVDs
//        dvdList = new ArrayList<DVD>();
//
//        // declares and creates all the dvd objects
//        DVD dvd1 = new DVD(1, "Twilight Zone");
//        DVD dvd2 = new DVD(2, "Immortals");
//        DVD dvd3 = new DVD(3, "Puss in boots");
//        DVD dvd4 = new DVD(4, "Adventure of Tintin");
//
//        // add the objects to the ArrayList
//        dvdList.add(dvd1);
//        dvdList.add(dvd2);
//        dvdList.add(dvd3);
//        dvdList.add(dvd4);
//
//        // another way to do this!
//        dvdList.add(new DVD(5, "Transformer"));
    }

    private void load() {
        try (Scanner sc = new Scanner(dvdFile)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                if (line == null || line.isEmpty()) break;
                Scanner lineSc = new Scanner(line);
                lineSc.useDelimiter(",");
                dvdList.add(new DVD(lineSc.nextInt(), lineSc.next()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataException("Can't read DVD data", e);
        }
    }

    // returns the whole ArrayList of DVD objects
    public ArrayList<DVD> retrieveAll() {
        return dvdList;
    }

    // returns a single DVD object of a particular title, 
    // or null if there is no matching DVD
    public DVD retrieve(String title) {
        for (int i = 0; i < dvdList.size(); i++) {
            DVD d = dvdList.get(i);
            if (d.getTitle().equals(title)) {
                return d;
            }
        }
        return null;
    }

    // adds a new DVD into dvdList with the specified title
    // the ID of this new DVD is automatically generated
    public void add(String title) {
        int nextId = dvdList.size() + 1;
        DVD dvd = new DVD(nextId, title);
        write(dvd);
        dvdList.add(dvd);
    }
    
    public void write(DVD dvd) {
        try (PrintStream fileOut = new PrintStream(new FileOutputStream(dvdFile, true))) {
            fileOut.printf("%d,%s\n", dvd.getId(), dvd.getTitle());
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataException("Can't write to dvd.csv", e);
        }
    }
}
