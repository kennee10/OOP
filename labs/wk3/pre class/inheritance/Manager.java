// Manager is an employee and has a salary as well
// Why not inherit stuff like salary from the employee class and add in additional stuff like bonus

public class Manager extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int b) {
        this.bonus = b;
    }
}
