<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Title</title>
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>

<div class="shadowbox">
    <p>User Registration
    <form action="/register" method="post">
        <table style="with: 80%">
            <tr>
                <td>First Name</td>
                <td><input type="text" name="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastName" /></td>
            </tr>
            <tr>
                <td>Login</td>
                <td><input type="text" name="login" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td>Phone</td>
                <td><input type="text" name="phone" /></td>
            </tr>
            <tr>
                <td>Faculty</td>
                <td><input type="text" name="faculty_name" /></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>

