/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentMain;

import departmentDB.Department;
import departmentDB.Employee;
import model.DepartmentTable;
import model.EmployeeTable;

/**
 *
 * @author PAktobchawa
 */
public class deleteDB {
    public static void main(String[] args) {
        Department dept1 = new Department(3, "IT");
        Department dept2 = new Department(4, "HR");
        DepartmentTable.removeDepartment(dept1);
        DepartmentTable.removeDepartment(dept2);
        
        Employee emp1 = new Employee(5, "John", "Network Admin", 56789, dept1);
        Employee emp2 = new Employee(6, "Marry", "HR Manager", 46789, dept2);
        Employee emp3 = new Employee(7, "Herry", "Programmer", 67890, dept1);
        Employee emp4 = new Employee(8, "Clark", "HR recruiter", 36789, dept2);
        EmployeeTable.removeEmployee(emp1);
        EmployeeTable.removeEmployee(emp2);
        EmployeeTable.removeEmployee(emp3);
        EmployeeTable.removeEmployee(emp4);
    }
}
