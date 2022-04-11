import java.io.File;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class RentalDAO {
    private ArrayList<Rental> rentalList = new ArrayList<>();
    private File rentalFile;

    private DVDDAO dvdMgr;
    private PatronDAO patronMgr;

    // constructor
    /*   //by vandana
    public RentalDAO() {
        try {
            dvdMgr = new DVDDAO();
            patronMgr = new PatronDAO();
        } catch (DataException e) {
            System.out.println("Internal Error.");
            System.exit(-1);
        }
        load();
    }
    */
    
    public RentalDAO(DVDDAO dMgr, PatronDAO pMgr) {
        try {
            dvdMgr = dMgr;
            patronMgr = pMgr;
            load();
        } catch (DataException e) {
            System.out.println("Internal Error.");
            System.exit(-1);
        }
    }
    

    private void load() {
        rentalFile = new File("data/rental.csv");
        try (Scanner sc = new Scanner(rentalFile)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                if (line == null || line.isEmpty()) break;
                Scanner lineSc = new Scanner(line);
                lineSc.useDelimiter(",");
                rentalList.add(new Rental(
                            lineSc.nextInt(),
                            patronMgr.retrieve(lineSc.next()), 
                            dvdMgr.retrieve(lineSc.next())));
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataException("Can't read DVD data", e);
        }
    }

    // adds a new Rental to the rentalList. This method takes in the patron.csv & dvd and creates an ID for the Rental
    public void add(Patron patron, DVD dvd) {
        int nextId = rentalList.size() + 1;
        Rental rental = new Rental(nextId, patron, dvd);
        write(rental);
        rentalList.add(rental);
    }

    public void write(Rental rental) {
        try (PrintStream fileOut = new PrintStream(new FileOutputStream(rentalFile, true))) {
            fileOut.printf("%d,%s,%s\n", 
                    rental.getId(), 
                    rental.getPatron().getUsername(), 
                    rental.getDVD().getTitle());
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataException("Can't write to rental.csv", e);
        }
    }

    // returns the ArrayList of Rental objects
    public ArrayList<Rental> retrieveAll() {
        return rentalList;
    }
}
