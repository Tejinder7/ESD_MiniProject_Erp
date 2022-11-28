package com.example.DAO.DAOImplement;

import com.example.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.Bean.accounts_dept;
import com.example.DAO.accounts_deptDAO;

public class accounts_depDAOImpl implements accounts_deptDAO{
    @Override
    public boolean addUser(accounts_dept deptObj) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction transaction = ((Session) session).beginTransaction();
            session.persist(deptObj);
            transaction.commit();
            return true;
        }
        catch (HibernateException exception) {
            System.out.println("Hibernate Exception");
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}
