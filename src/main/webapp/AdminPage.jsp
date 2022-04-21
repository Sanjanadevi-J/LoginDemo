<%--
  Created by IntelliJ IDEA.
  User: sanjana
  Date: 19-04-2022
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
Hello <%=session.getAttribute("UserName")%><br>
Welcome to the Admin page
<form action="Add Student" class="AddStudent" method="post">
<input type="submit" value="Add Student">
</form>
<form action="View Record" class="ViewRecord" method="post">
    <input type="submit" value="View Record">
</form>
<form action="Logout" class="LogoutPage" method="post">
    <input type="submit" value="Logout">
</form>

</body>
</html>
