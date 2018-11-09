<%@ page import="cap.db.DBCon" %><%--
  Created by IntelliJ IDEA.
  User: starlee
  Date: 2018/11/7
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String sql = "insert into admin(username,password) values(?,?)";
    DBCon dbCon = new DBCon();
    int res = dbCon.doUpdate(sql, new Object[]{username, password});
    if (res > 0)
        response.sendRedirect("do_query.jsp");
    else
        out.print("add error");
%>
</body>
</html>
