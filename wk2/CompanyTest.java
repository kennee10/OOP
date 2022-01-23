import java.util.jar.Attributes.Name;
import java.util.*;
import javax.sql.rowset.serial.SerialArray;

public class CompanyTest {

    public static void main(String[] args) {
        Company ums = new Company("UMS");

        Spouse spouse5 = new Spouse("Kate", 37);
        Employee employee5 = new Employee("John", 5, 2500, 'M', spouse5);
        ums.addEmployee(employee5);

        System.out.printf("Total salary(before): $%.1f \n\n", ums.getAllEmployeesSalary());

        // d
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        // read and discard the value
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextInt();

        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);
        
        Employee employee6 = new Employee(name, id, salary, gender);
        ums.addEmployee(employee6);
        System.out.println();
        System.out.printf("Total salary(after): $%.1f \n", ums.getAllEmployeesSalary());
        System.out.println();

        // f,g
        for (int i = 4; i < 6; i++) {
            checkEmployee(ums, i);
        }
    }

    public static void checkEmployee(Company comp, int id) {
        Employee employee = comp.getEmployee(id);
        Spouse gotSpouse = employee.getSpouse();
        String status = "";
        if (gotSpouse == null) {
            status = "Single";
        } else {
            status = "Married";
        }
        System.out.printf("Name: %s, Salary: $%.2f, Status: %s \n", employee.getName(), employee.getSalary(), status);
        if (status == "Married") {
            System.out.println("Spouse's name: "+ gotSpouse.getName());
        }
    }   
}
