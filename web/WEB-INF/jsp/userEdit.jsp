<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加用户</title>
</head>

<body>


<form action="/ssmdemo/user/edit" method="post">
    <input type="hidden" value="${user.id}" name="id">
    用户名 <input type="text" name="userName" value="${user.userName}">
    <br>
    密码 <input type="text" name="password" value="${user.password}">
    <br>
    年龄 <input type="text" name="age" value="${user.age}">

    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>