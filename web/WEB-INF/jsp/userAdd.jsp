<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加用户</title>
</head>

<body>


<form action="/ssmdemo/user/add" method="post">
    用户名 <input type="text" name="userName">
    <br>
    密码 <input type="text" name="password">
    <br>
    年龄 <input type="text" name="age">

    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>