package com.dawissem.bank2.Service.Impl;


import com.dawissem.bank2.DBUtil.DBUtil;
import com.dawissem.bank2.Service.UserService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Service
public class UserServiceImpl implements UserService {


Connection connection;
int flag=0;
public  UserServiceImpl() throws SQLException {
    connection= DBUtil.getConnection();
}
    @Override
    public int loginValidation(Integer matricule, String password) {
    try {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where matricule = '"+matricule+ "'");
       ResultSet rs= preparedStatement.executeQuery();
       while(rs.next()){
           if (rs.getInt(1)==(matricule) && rs.getString(6).equals(password)){
               flag=1;
           }
           else
           {
               System.out.println("Matricle ou mot de pass wrong");
           }


       }
    }
    catch (SQLException e) {
    e.printStackTrace();
    }
    return flag;

}
}
