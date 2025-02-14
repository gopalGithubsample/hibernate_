package entities;

public class Employee {
    private int empId;
    private String empName;

    public Employee() {} // Important: No-argument constructor for Hibernate

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // Getters and setters (Important!)
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}