<%--
  Created by IntelliJ IDEA.
  User: starlee
  Date: 2018/11/7
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update" method="post">
    <input type="hidden" name="admin.id" value="<s:property value="admin.id"/>">
    <input type="text" name="admin.username" value="<s:property value="admin.username"/>"><br>
    <input type="text" name="admin.password" value="<s:property value="admin.password"/>"><br>
    <input type="submit" value="update">
</form>
</body>
</html>
