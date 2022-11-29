package com.example.miniprojecterp.Driver;

import com.example.miniprojecterp.Bean.Bill;
import com.example.miniprojecterp.Bean.Domain;
import com.example.miniprojecterp.Bean.Student;
import com.example.miniprojecterp.DAO.BillDAO;
import com.example.miniprojecterp.DAO.DAOImplement.BillDAOImpl;
import com.example.miniprojecterp.DAO.DAOImplement.StudentDAOImpl;
import com.example.miniprojecterp.DAO.StudentDAO;

public class Application {
    public static void main(String args[]){
        System.out.println("Application Started");
        runApplication();
        System.out.println("End");
    }
    private static void runApplication() {
        StudentDAO studDAO= new StudentDAOImpl();
        Student stud1= studDAO.getStudent(201);
        System.out.println(stud1);

        Bill bill1= new Bill();
        bill1.setBill_date("2022-11-29");
        bill1.setDeadline("2022-12-31");
        bill1.setAmount(92000);
        bill1.setDescription("2nd Sem fee");
        bill1.setStud(stud1);

        BillDAO billDAO= new BillDAOImpl();

        if(billDAO.addBill(bill1)) {
            System.out.println("Bill 1 added Successfully");
        }
    }
}