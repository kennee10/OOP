// child
public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getGrossAllowance() {
        return this.getBaseAllowance() + this.vocationAllowance;
    }

    public String toString() {
        return "Commando{Soldier{name='" + this.getName() + "', baseAllowance=" + this.getBaseAllowance() + "}, vocationAllowance=" +this.vocationAllowance + "}";
    }
}