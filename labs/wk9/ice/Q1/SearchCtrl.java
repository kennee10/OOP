public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        InterestGroup ig =  IGDM.retrieve(IGName);
        
        System.out.println(ig);
        if (ig != null) {
            Student president = ig.retrievePresidentInYear(year);
            System.out.println(president);
            return president;
        }
        // return null;
        return null;
    }
}
