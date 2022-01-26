/**
 * Created by yeowleong on 26/4/16.
 */
public class SoldierTest {
    public static void main(String[] args) {
        Commando c = new Commando("Peter", 5000, 200);
        Soldier s = new Soldier("John", 3000);

        System.out.println(c);
        System.out.println(s);

        System.out.println("Commando's base allowance : " + c.getBaseAllowance());
        System.out.println("Commando's gross allowance : " + c.getGrossAllowance());
        System.out.println("Soldier's base allowance : " + s.getBaseAllowance());
        System.out.println("Soldier's gross allowance : " + s.getGrossAllowance());
    }
}

// parent
class Soldier {
    private String name;
    private double baseAllowance;

    public Soldier(String name, double baseAllowance) {
        this.name = name;
        this.baseAllowance = baseAllowance;
    }

    public String getName() {
        return this.name;
    }

    public double getBaseAllowance() {
        return this.baseAllowance;
    }

    public double getGrossAllowance() {
        return this.baseAllowance;
    }

    public String toString() {
        return "Soldier{name='" + this.name + "', baseAllowance=" + this.baseAllowance + "}";
    }
}

// child
class Commando extends Soldier {
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