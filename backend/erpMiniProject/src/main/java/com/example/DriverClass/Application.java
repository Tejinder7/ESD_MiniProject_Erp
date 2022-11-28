package com.example.DriverClass;

import com.example.Bean.accounts_dept;
import com.example.DAO.DAOImplement.accounts_depDAOImpl;
import com.example.DAO.accounts_deptDAO;

public class Application {
    public static void main(String args[]){
        System.out.println("Application Started");
        runApplication();
        System.out.println("End");
    }
    private static void runApplication() {
        accounts_dept dept1= new accounts_dept("Phil", "Coulson", "coulson@shield.com", "agent");
        accounts_dept dept2= new accounts_dept();
        dept2.setFirst_name("Everett");
        dept2.setLast_name("Ross");
        dept2.setEmail("redhulk@shield.com");
        dept2.setPassword("president");
        accounts_deptDAO deptDAO= new accounts_depDAOImpl();
        if(deptDAO.addUser(dept1)){
            System.out.println("department 1 added Successfully");
        }
        if(deptDAO.addUser(dept2)){
            System.out.println("department 2 added Successfully");
        }
    }
}
