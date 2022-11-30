package com.example.miniprojecterp.Services;

import com.example.miniprojecterp.DAO.DAOImplement.UserDAOImpl;

public class LoginService {
    public boolean login(String user_name,String user_password)
    {
        boolean result = new UserDAOImpl().login(user_name, user_password);
        return result;
    }
}
