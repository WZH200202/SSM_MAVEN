<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/09/06
  Time: 下午 04:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="list" items="${list}">
        <tr>
            <td>${list.id}</td>
            <td>${list.userCode}</td>
            <td>${list.userName}</td>
            <td><a href="/update?id=${list.id}">修改</a></td>
            <td><a href="/delete?id=${list.id}">删除</a></td>
        </tr>
    </c:forEach>
    <td><a href="/insert">新增</a></td>
</table>
</body>
</html>
