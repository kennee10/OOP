public class AdvancedBookingTicket extends Ticket{
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double ogPrice = super.calculatePrice();
        double halfPrice = ogPrice/2;
        if ((numDaysInAdvance * 0.5) >= halfPrice) {
            return halfPrice;
        } else {
            return ogPrice - numDaysInAdvance * 0.5;
        }
    }
}
