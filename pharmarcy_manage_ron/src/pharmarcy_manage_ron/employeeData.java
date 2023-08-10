/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmarcy_manage_ron;

/**
 *
 * @author Dell
 */
public class employeeData {
    private Integer employeeID;
    private String fullName;
    private String position;
    private Double salary;
    private String status;
    
    public employeeData(Integer employeeId, String fullName, String position, Double salary, String status){
        this.employeeID = employeeId;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.status = status;
    }
    
    public Integer getEmployeeId(){
        return employeeID;
    }
    public String getFullName(){
        return fullName;
    }
    public String getPosition(){
        return position;
    }
    public Double getSalary(){
        return salary;
    }
    public String getStatus(){
        return status;
    }
}
