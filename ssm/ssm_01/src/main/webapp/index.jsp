<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/11
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="account/findAll">查询用户信息</a>
    <form action="account/save" method="post">
        姓名:<input type="text" name="name"><br>
        金额:<input type="text" name="money"><br>
        <input type="submit" value="保存"><br>
    </form>

</body>
</html>
