<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<div align="center">
    <h1>User Login Form</h1>
    <form action="<%=request.getContextPath()%>/login" method="post">
        <table style="with: 100%">
            <tr>
                <td>Your Login</td>
                <td><input type="text" name="login" /></td>
            </tr>
            <tr>
                <td>Your Password</td>
                <td><input type="password" name="password" /></td>
            </tr>

        </table>
            <input type="submit" value="Submit" />

        <a href="/register">Create New Account</a>
    </form>
</div>
</body>
</html>
