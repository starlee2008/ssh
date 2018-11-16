<%--
  Created by IntelliJ IDEA.
  User: starlee
  Date: 2018/11/16
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <s:iterator value="pageBean.list" var="admin">
        <tr>
            <td><s:property value="#admin.id"/></td>
            <td><s:property value="#admin.username"/></td>
            <td><s:property value="#admin.password"/></td>
        </tr>
    </s:iterator>
    <tr>
        <td>共<s:property value="pageBean.getTotalPages()"/>页,当前<s:property value="pageBean.getPageNo()"/>页
            <a href="list?pageNo=<s:property value="pageBean.getTopPageNo()"/>">首页</a>
            <a href="list?pageNo=<s:property value="pageBean.getPreviousPageNo()"/>">上一页</a>
            <a href="list?pageNo=<s:property value="pageBean.getNextPageNo()"/>">下一页</a>
            <a href="list?pageNo=<s:property value="pageBean.getBottomPageNo()"/>">尾页</a>
        </td>
    </tr>
</table>
</body>
</html>
