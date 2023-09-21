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
public class insertDB {
    public static void main(String[] args) {
       //Fill in DepartmentDB Detail 
        Department dept1 = new Department(1, "IT");
        Department dept2 = new Department(2, "HR");

         //Insert Data into Database 
        DepartmentTable.insertDepartment(dept1);
        DepartmentTable.insertDepartment(dept2);

         //Fill in Employee Detail 
        Employee emp1 = new Employee(1, "John", "Network Admin", 56789, dept1);
        Employee emp2 = new Employee(2, "Marry", "HR Manager", 46789, dept2);
        Employee emp3 = new Employee(3, "Herry", "Programmer", 67890, dept1);
        Employee emp4 = new Employee(4, "Clark", "HR recruiter", 36789, dept2);

         //Insert Data into Database 
        EmployeeTable.insertEmployee(emp1);
        EmployeeTable.insertEmployee(emp2);
        EmployeeTable.insertEmployee(emp3);
        EmployeeTable.insertEmployee(emp4); 
        
    }
}
