package com.example.miniprojecterp.Services;

import com.example.miniprojecterp.Bean.Bill;
import com.example.miniprojecterp.Bean.Student;
import com.example.miniprojecterp.DAO.BillDAO;
import com.example.miniprojecterp.DAO.DAOImplement.BillDAOImpl;
import com.example.miniprojecterp.DAO.DAOImplement.StudentDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class BillService {
    public Student getStudentId(int id) {
        Student student = new StudentDAOImpl().getStudent(id);
        return student;
    }

    public List<Student> getStudentList(int domainId) {
        List<Student> students = new StudentDAOImpl().getDomainStudents(domainId);
        return students;
    }

    public List<Bill> viewAllBills()
    {
        List<Bill> allBills= new BillDAOImpl().getAllBills() ;
        return allBills;
    }


    public void addNewSingleBill(String description, int amount, String bill_date, String deadline, Student student){
        Bill bill= new Bill();
        bill.setDescription(description);
        bill.setAmount(amount);
        bill.setBill_date(bill_date);
        bill.setDeadline(deadline);
        bill.setStud(student);

        new BillDAOImpl().addBill(bill);
    }

    public void updateBillAmount(Integer billId,Integer amount)
    {
        new BillDAOImpl().updateBillAmt(billId, amount);
    }

    public void updateBillDead(Integer billId,String date)
    {
        new BillDAOImpl().updateBillDeadline(billId,date);
    }

    public void deleteBill(Integer billId)
    {
        new BillDAOImpl().deleteBill(billId);
//        new Student_paymentDAOimpl().delBills(BillId);
    }
}
