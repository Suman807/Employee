package first.src;
import first.lib.utils.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Employee emp1 = new Employee("1024", "Alex");
        System.out.println(emp1);
        Employee emp2 = new Employee();
        emp2.setEmpId("420");
        emp2.setEmpName("Ankit");
    }
}
