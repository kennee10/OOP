
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    public int checkMembershipDuration(String studName, String teamName) {
        Team team = teamDAO.retrieve(teamName);
        if (team == null) {
            return -1;
        }

        Student student = team.retrieve(studName);
        if (student == null) {
            return -1;
        }

        TMSDate dateFormed = team.getDateFormed();
        TMSDate dateJoined = student.getDateJoined();
        return dateJoined.calculateDifference(dateFormed);
    }
}
