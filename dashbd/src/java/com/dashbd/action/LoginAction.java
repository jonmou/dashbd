/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.action;

import com.dashbd.conf.TextConf;
import com.dashbd.dao.UserDao;
import com.dashbd.form.UserForm;
import com.dashbd.tool.StringTool;
import javax.servlet.http.*;
import org.apache.struts.action.*;

/**
 *
 * @author I301095
 */
public class LoginAction extends Action {

    /**
     * 处理请求的方法
     */
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        // 获得表单及表单信息
        UserForm lf = (UserForm) form;
        String username = lf.getUsername();
        String password = lf.getPassword();

        //response.getWriter().print(TextConf.VIEW_NO_GENERAL);

//        Gson gson = new Gson();
//        String[] values = {"1","mouyantao","haha"};
//        String json = gson.toJson(values);
//        response.getWriter().write(json);


        /*
        UserDao dao = new UserDao((UserForm) form);
        int res = dao.save();
        response.getWriter().println(res);
        */
        
        String str = "1,222,333,444,555";
        int[] arr = StringTool.parseString(str);
        for (int i = 0 ; i < arr.length ; i ++)
        {
            //response.getWriter().print(arr[i] + "  ");
        }
        
        String[] array = {"1"};
        String _str = StringTool.parseArray(array);
        //response.getWriter().print(_str + "  ");
        
       
        /* */
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