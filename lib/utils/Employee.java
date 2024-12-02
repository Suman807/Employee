package first.lib.utils;
import java.util.*;

public class Employee {
    String employeeId;
    String EmployeeName;

    public Employee(String empID,String EmployeeName){
        this.employeeId = empID;
        this.EmployeeName = EmployeeName;
    }

    public Employee(){
        this.employeeId=null; 
        this.EmployeeName=null;
    }

    public void setEmpId(String Id){
        this.employeeId = Id;
    }
    public void setEmpName(String EmployeeName){
        this.EmployeeName = EmployeeName;
    }

    public String getEmpID(){
        return this.employeeId;
    }

    public String getEmpName(){
        return this.EmployeeName;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("EmployeeName: ").append(this.EmployeeName).append("\nEmployee Id:").append(employeeId);
        return sb.toString();
    }
}
