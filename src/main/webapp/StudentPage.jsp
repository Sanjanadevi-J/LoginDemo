<%--
  Created by IntelliJ IDEA.
  User: sanjana
  Date: 20-04-2022
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Page</title>
</head>
<body>
 Hello <%=session.getAttribute("UserName")%><br>
Welcome to the Student page
<form action="View Record" class="ViewRecords" method="post">
    <input type="submit" value="View Record">
</form>
<form action="Logout" class="LogoutPage" method="post">
    <input type="submit" value="Logout">
</form>
</body>
</html>
