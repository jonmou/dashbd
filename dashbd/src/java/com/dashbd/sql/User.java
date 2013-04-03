package com.dashbd.sql;

import com.dashbd.form.LoginForm;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I301095
 */
public class User extends DaoBase {
    private LoginForm form;
    
    public User(LoginForm form) throws Exception 
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
            String sql = "insert into user(ID,UserID,UserName)values(1,'123','12345')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            int res = pstmt.executeUpdate();
            
            //pstmt.close();
            //conn.close();
            return res;
           
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
