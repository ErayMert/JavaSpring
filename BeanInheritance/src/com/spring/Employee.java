package com.spring;

/**
 * Created by eraym on 28.07.2018.
 */
public class Employee {

    private int employeeId;
    private String employeeName;
    private String country;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
