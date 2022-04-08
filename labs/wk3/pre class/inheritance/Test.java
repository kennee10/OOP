public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setSalary(30);
        m.setBonus(20);
        System.out.println("Manager's salary is " + m.getSalary());
        System.out.println("Manager's bonus is " + m.getBonus());
    }
}
