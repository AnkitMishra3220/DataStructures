package com.ankit.ds.java8;

public class Employee {

    int empId;
    String empName;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    int salary;
    String address;

    Employee(int empId, String empName, int salary, String address){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

}
