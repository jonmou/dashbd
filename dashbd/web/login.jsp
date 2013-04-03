<%-- 
    Document   : login
    Created on : Apr 2, 2013, 5:03:35 PM
    Author     : I301095
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<div type="container">
    <form action="login.do" method="post">
        账号：
        <input type="text" name="username" />
        <br>
        密码：
        <input type="password" name="password" />
        <br>
        <input type="submit" value="登录" />
        <input type="reset" name="重置" />
        <br>
    </form>       
</div>
<jsp:include page="sidebar.jsp" />
<jsp:include page="footer.jsp" />