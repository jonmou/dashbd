/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.action;

import com.dashbd.form.LoginForm;
import com.dashbd.sql.*;
import com.google.gson.Gson;
import java.sql.ResultSet;
import javax.servlet.http.*;
import org.apache.struts.action.*;

/**
 *
 * @author I301095
 */
/**
 * 控制体Action类
 *
 * @author 梦缘
 *
 */
public class LoginAction extends Action {

    /**
     * 处理请求的方法
     */
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request, 
                                 HttpServletResponse response) throws Exception 
    {
        // 获得表单及表单信息
        LoginForm lf = (LoginForm) form;
        String username = lf.getUsername();
        String password = lf.getPassword();
    

//        Gson gson = new Gson();
//        String[] values = {"1","mouyantao","haha"};
//        String json = gson.toJson(values);
//        response.getWriter().write(json);
        
        User user = new User((LoginForm)form);
        int res = user.save();
        response.getWriter().println(res);
        return null;
        /*
         if ("admin".equals(username) && "123".equals(password)) {
         return mapping.findForward("success");
         } else {
         return mapping.findForward("error");
         }
         */
    
     }
}