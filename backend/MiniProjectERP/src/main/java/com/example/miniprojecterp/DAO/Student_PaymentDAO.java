package com.example.miniprojecterp.DAO;

import com.example.miniprojecterp.Bean.Student_Payment;

import java.util.List;

public interface Student_PaymentDAO {
    public List<Student_Payment> viewPayments();

    public boolean addPayment(Student_Payment payment);
}
