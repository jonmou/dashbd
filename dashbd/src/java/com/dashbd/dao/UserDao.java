package com.dashbd.dao;

import com.dashbd.form.UserForm;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I301095
 */
public class UserDao extends DaoBase {
    private UserForm form;
    
    public UserDao(UserForm form) throws Exception 
    {
        super();
        this.form = form;   
        validate();
    }
    public void validate() throws Exception
    {
        if (this.form.getUsername().equals(""))
        {
            throw new Exception("用户名不为空");
        }
        if (this.form.getPassword().equals(""))
        {
            throw new Exception("密码不为空");
        }
    } 
    
    public int save() throws Exception
    {
        try {
           
            String productID = this.form.getUsername();
            String productName = this.form.getPassword();
            String[] sqls = {"insert into user(ID,UserID,UserName,ViewGroup,Password)values(1,'I301095','Mou, Yantao','101,102,103,104,105','Mou, Yantao')",
            "insert into user(ID,UserID,UserName,ViewGroup,Password)values(2,'*******','Tan, Shengtao','101,102','Tan, Shengtao')",
            "insert into user(ID,UserID,UserName,ViewGroup,Password)values(3,'*******','Lu, Steven','101,102,103','Lu, Steven')",
            "insert into user(ID,UserID,UserName,ViewGroup,Password)values(4,'*******','admin','101,102,103,104,105','admin')"
            };
            PreparedStatement pstmt = null;
            for (int i = 0; i < sqls.length; i++) {
                pstmt = conn.prepareStatement(sqls[i]);
                int res = pstmt.executeUpdate();
            }
            pstmt.close();
            conn.close();
            return 1;
           
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
}
