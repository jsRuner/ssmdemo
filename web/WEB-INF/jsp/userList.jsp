<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ft521
  Date: 2017/9/15
  Time: 下午1:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/ssmdemo/user/add">添加用户</a>

<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>



<c:forEach var="user" items="${users}">

    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.password}</td>
        <td>${user.age}</td>
        <td>
            <a href="/ssmdemo/user/delete?id=${user.id}">删除</a>
            <a href="/ssmdemo/user/edit?id=${user.id}">编辑</a>
        </td>
    </tr>





</c:forEach>
</table>
</body>
</html>
