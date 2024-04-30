<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nikol
  Date: 19.02.2024
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shop</title>
</head>
<body>
<tbody>
<c:forEach var="pantsList" items="${list}">
    <td>${list.img}</td>
    <td><strong></strong>${list.name}</td>
</c:forEach>
</tbody>
</body>
</html>
