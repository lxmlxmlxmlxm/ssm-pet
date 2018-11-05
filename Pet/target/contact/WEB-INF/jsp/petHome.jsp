<%@ taglib prefix="e" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/pet" method="post" <%--enctype="multipart/form-data"--%> >
    宠物名：<input type="text" name="name">
    宠物类型：
    <select name="categoryid">
        <c:forEach items="${categories}" var="t">
            <option value="${t.c_id}">${t.c_name}</option>
        </c:forEach>
    </select>
    宠物价格：<input type="number" name="price">
    宠物状态：
    <select name="status">
        <option value="available">可用</option>
        <option value="pending">待定</option>
        <option value="sold">已售出</option>
    </select>
   <%-- <input type="file" name="mfile" />--%>
    <input type="submit" value="确定添加" />
</form><br/>

<table>
    <tr>
        <th>编号</th>
        <th>类型</th>
        <th>姓名</th>
        <th>价格</th>
        <th>状态</th>
    </tr>
    <c:forEach items="${pets}" var="e" >
        <tr>
            <td> ${e.id} </td>
            <td>${e.category.c_name}
            <td> ${e.name} </td>
            <td> ${e.price} </td>
            <td> ${e.status} </td>
            <td><a href="/pet/del/${e.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
