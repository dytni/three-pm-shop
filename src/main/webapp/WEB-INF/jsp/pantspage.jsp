<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>товары</title>
</head>
<body>
<c:forEach items="${pantslist}" var="p">
    <tr>
        <td><c:out value="${p}" /></td>
        <td><c:out value="${p.img}"/></td>
    </tr>
</c:forEach>

</body>
</html>
