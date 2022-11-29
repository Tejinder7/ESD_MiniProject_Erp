package com.example.miniprojecterp.Bean;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name= "domain")
public class Domain {
    @Id
    @Column(name= "domain_id")
    @GeneratedValue(generator = "incrementer")
    @GenericGenerator(name = "incrementer", strategy = "increment")
    private int domain_id;

    @Column(name= "program")
    private String program;

    @Column(name= "batch")
    private int batch;

//    @OneToMany(mappedBy = "dom", fetch = FetchType.EAGER)
//    private List<Student> stud;

    public Domain(String program, int batch, List<Student> stud) {
        this.program = program;
        this.batch = batch;
//        this.stud = stud;
    }

    public Domain() {

    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

//    public List<Student> getStud() {
//        return stud;
//    }

//    public void setStud(List<Student> stud) {
//        this.stud = stud;
//    }

    @Override
    public String toString() {
        return "Domain{" +
                "domain_id=" + domain_id +
                ", program='" + program + '\'' +
                ", batch=" + batch +
//                ", stud=" + stud +
                '}';
    }
}
