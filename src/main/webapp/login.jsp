<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<!doctype html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>
<%
    Cookie[] cookies=request.getCookies();
    String login= "", password = "",rememberMe="";
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("login")) {
                login = cookie.getValue();
            }
            if(cookie.getName().equals("password")){
                password = cookie.getValue();
            }
            if(cookie.getName().equals("remember")){
                rememberMe = cookie.getValue();
            }
        }
    }
%>
<div class="center">
    <h1>����</h1>
    <form action="/login" method="post">
        <div class="txt_field">
            <input type="text" name="login" placeholder="�����">
        </div>
        <div class="txt_field">
            <input type="password" name="password" placeholder="������">
        </div>
        <input type="submit" value="�����">
<%--        <br>--%>
<%--        <label><input type="checkbox" value="rememberMe">��������� ����?</label>--%>
        <div class="signup_link">��� ��������?
            <a href="/register">�����������</a>
        </div>
    </form>
</div>
</body>
</html>