/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author macstudent
 */
public class employee {
    int employeeId;
    String employeeName;
    float salary;
    public void setValues(int id,String name,float sal)
    {
        employeeId = id;
        employeeName = name;
        salary = sal;
    }
    public void display()
    {
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(salary);
        System.out.println("Hello Java");
    }
  
    
  
}
