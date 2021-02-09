package com.learning.designPatterns.SuperClassExample;

public class Employee {

    int empId;
    String empName;
    double salary;

    Email email;
    int grade;
    String company = "IBM";

    public void notifyEmployee(){
        email.sendEmail();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




    public Employee(int empId, String empName, Email email){
        this.empId= empId;
        this.empName=empName;
        this.email= email;
    }
}
