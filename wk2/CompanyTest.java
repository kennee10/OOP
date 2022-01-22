
public class CompanyTest {

    public static void main(String[] args) {
        Company ums = new Company("UMS");

        Spouse spouse5 = new Spouse("Kate", 37);
        Employee employee5 = new Employee("John", 5, 2500, 'M', spouse5);
        ums.addEmployee(employee5);

        System.out.printf("Total salary(before): $%.1f", ums.getAllEmployeesSalary());

    }
}
