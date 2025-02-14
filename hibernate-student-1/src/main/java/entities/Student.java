package entities;

import jakarta.persistence.*;

@Entity // Marks the class as a JPA entity
@Table(name = "STUDENT") // Optional: Specify table name (defaults to class name)
public class Student {

    @Id // Marks the field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates primary key
    @Column(name = "roll_number") // Optional: Specify column name
    private int rollNumber;

    @Column(name = "student_name") // Optional: Specify column name
    private String name;

    public Student() {} // Required no-argument constructor

    public Student(String name) {
        this.name = name;
    }

    // Getters and setters for rollNumber and name (Important!)

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}