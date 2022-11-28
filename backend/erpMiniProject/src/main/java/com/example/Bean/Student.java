package com.example.Bean;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name= "student")
public class Student {
    @Id
    @Column(name="student_id")
    @GeneratedValue(generator = "incrementer")
    @GenericGenerator(name = "incrementer", strategy = "increment")
    private int student_id;

    @Column(name="roll_no")
    private int roll_no;

    @Column(name="first_name")
    private String first_name;

    @Column(name= "last_name")
    private String last_name;

    @ManyToOne
    private Domain domain;

    @OneToMany
    private List<Bill> bills;

    public Student() {

    }

    public Student(int roll_no, String first_name, String last_name, Domain domain, List<Bill> bills) {
        this.roll_no = roll_no;
        this.first_name = first_name;
        this.last_name = last_name;
        this.domain = domain;
        this.bills = bills;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", roll_no=" + roll_no +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", domain=" + domain +
                ", bills=" + bills +
                '}';
    }
}
