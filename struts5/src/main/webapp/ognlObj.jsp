<%--
  Created by IntelliJ IDEA.
  User: starlee
  Date: 2018/9/14
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p style="color:red">访问ValueStack中的对象属性</p>
<s:property value="user.username"/>
<p style="color:red">applicationz中的值</p>
<s:property value="#application.msg"/>
<p style="color:red">会话属性中的帐号：</p>
<s:property value="#session.msg"/>
<p style="color:red">request中的值</p>
<s:property value="#request.msg"/>
<p style="color:red">访问参数</p>
<s:property value="#parameters.msg"/>
<p style="color:red">attr中的信息</p>
<s:property value="#attr.msg" /><!--代码 -->

</body>
</html>
