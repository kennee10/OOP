public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        InterestGroup IG = IGDM.retrieve(IGName);

        if (IG != null) {
            Student pres = IG.retrievePresidentInYear(year);
            return pres;
        }
        return null;
    }
}
