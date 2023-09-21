/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentMain;

import departmentDB.Employee;
import departmentDB.Department;
import java.util.Collection;
import model.EmployeeTable;
import model.DepartmentTable;
import java.util.List;



/**
 *
 * @author PAktobchawa
 */
public class DepartmentReport {
    public static void main(String[] args) {
        System.out.println("All Employee (By ID)");
        System.out.println("---------------------------");
        List<Employee> empID = EmployeeTable.findAllEmployee();
        for(Employee emp : empID){
            System.out.println("ID: " + emp.getEmployeeid());
            System.out.println("Name: " + emp.getName());
            System.out.println("Job: " + emp.getJob());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartmentid().getName());
            System.out.println("---------------------------");
        }
        
        System.out.println("\nAll Employee (By Department)");
        System.out.println("---------------------------");
        
        List<Department> deptID = DepartmentTable.findAllDepartment();
      
        for(Department dept : deptID){
            System.out.print("Department ID: " + dept.getDepartmentid());
            System.out.println("\tDepartment Name: " + dept.getName());
            System.out.println("---------------------------");
            
            Collection<Employee> allEmp = dept.getEmployeeCollection();
            for(Employee emp : allEmp){
                System.out.println("ID: " + emp.getEmployeeid());
                System.out.println("Name: " + emp.getName());
                System.out.println("Job: " + emp.getJob());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("---------------------------");
            }
        }
    }
}
