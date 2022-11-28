package com.example.Bean;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;


@Entity
@Table(name= "bill")
public class Bill {
    @Id
    @Column(name= "id")
    @GeneratedValue(generator = "incrementer")
    @GenericGenerator(name = "incrementer", strategy = "increment")
    private int id;

    @Column(name= "description")
    private String description;

    @Column(name= "amount")
    private int amount;

    @Column(name= "bill_date")
    private Date bill_date;

    @Column(name= "deadline")
    private Date deadline;

    public Bill(String description, int amount, Date bill_date, Date deadline) {
        this.description = description;
        this.amount = amount;
        this.bill_date = bill_date;
        this.deadline = deadline;
    }

    public Bill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", bill_date=" + bill_date +
                ", deadline=" + deadline +
                '}';
    }
}
