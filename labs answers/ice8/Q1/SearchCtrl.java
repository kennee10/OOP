public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        InterestGroup ig = IGDM.retrieve(IGName);
        if (ig == null) {
            return null;
        }
        return ig.retrievePresidentInYear(year);
    }
}
