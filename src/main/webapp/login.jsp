<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
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
    String log= "", pass = "",remem="";
    Cookie[] cookies=request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("loginCookie")) {
                log = cookie.getValue();
            }
            if(cookie.getName().equals("passwordCookie")){
                pass = cookie.getValue();
            }
            if(cookie.getName().equals("rememberCookie")){
                remem = cookie.getValue();
            }
        }
    }
%>
<div class="center">
    <h1>Вход</h1>
    <form action="/login" method="post">
        <div class="txt_field">
            <input type="text" name="login" value="<%=log%>" placeholder="Логин">
        </div>
        <div class="txt_field">
            <input type="password" name="password" value="<%=pass%>" placeholder="Пароль">
        </div>
        <input type="submit" value="Войти">
        <div class="signup_link">Remember me:
            <input type="checkbox" name="remember" value="1"
        <%="1".equals(remem) ? "checked='/checked'" : "" %> >
        </div>
        <div class="signup_link">Нет аккаунта?
            <a href="/register">Регистрация</a>
        </div>
    </form>
</div>
</body>
</html>