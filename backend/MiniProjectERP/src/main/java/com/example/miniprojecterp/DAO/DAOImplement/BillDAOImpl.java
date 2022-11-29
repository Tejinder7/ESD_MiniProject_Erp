package com.example.miniprojecterp.DAO.DAOImplement;

import com.example.miniprojecterp.Bean.Bill;
import com.example.miniprojecterp.DAO.BillDAO;
import com.example.miniprojecterp.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BillDAOImpl implements BillDAO {
    @Override
    public boolean addBill(Bill bill) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction transaction = ((Session) session).beginTransaction();
            session.persist(bill);
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
